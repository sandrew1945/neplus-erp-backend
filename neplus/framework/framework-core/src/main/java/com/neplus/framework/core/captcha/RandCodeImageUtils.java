/**
 * 
 */
package com.neplus.framework.core.captcha;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * 随机生成验证图片
 * 
 * 
 */
public class RandCodeImageUtils {
    private static final long serialVersionUID = -1257947018545327308L;
    private static final String SESSION_KEY_OF_RAND_CODE = "captcha"; // todo 要统一常量
    
    /**指定随机生成字符类型*/
    private static final int randcodetype=5;
    /**随机码长度*/
    private static final int randcodelength=4;
    /**
	 * 
	 */
	private static final int count = 200;

    /**
     * 定义图形大小
     */
    private static final int width = 80;
	/**
	 * 定义图形大小
	 */
	private static final int height = 35;
	// private Font mFont = new Font("Arial Black", Font.PLAIN, 15); //设置字体
	/**
	 * 干扰线的长度=1.414*lineWidth
	 */
	private static final int lineWidth = 2;

	public static void generateImage(HttpServletResponse response, HttpServletRequest request) throws IOException
	{
		// 设置页面不缓存
//		response.setHeader("Pragma", "No-cache");
//		response.setHeader("Cache-Control", "no-cache");
//		response.setDateHeader("Expires", 0);
		// response.setContentType("image/png");
		
		response.setContentType("image/png");
        response.setHeader("Cache-Control", "no-cache, no-store");
        response.setHeader("Pragma", "no-cache");
        long time = System.currentTimeMillis();
        response.setDateHeader("Last-Modified", time);
        response.setDateHeader("Date", time);
        response.setDateHeader("Expires", time);

		// 在内存中创建图象
		final BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 获取图形上下文
		final Graphics2D graphics = (Graphics2D) image.getGraphics();

		// 设定背景颜色
		graphics.setColor(Color.WHITE); // ---1
		graphics.fillRect(0, 0, width, height);
		// 设定边框颜色
//		graphics.setColor(getRandColor(100, 200)); // ---2
		graphics.drawRect(0, 0, width - 1, height - 1);

        final Random random = new Random();
		// 随机产生干扰线，使图象中的认证码不易被其它程序探测到
		for (int i = 0; i < count; i++) {
			graphics.setColor(getRandColor(150, 200)); // ---3

			final int x = random.nextInt(width - lineWidth - 1) + 1; // 保证画在边框之内
			final int y = random.nextInt(height - lineWidth - 1) + 1;
			final int xl = random.nextInt(lineWidth);
			final int yl = random.nextInt(lineWidth);
			graphics.drawLine(x, y, x + xl, y + yl);
		}

		// 取随机产生的认证码(4位数字)
		final String resultCode = exctractRandCode();
		for (int i = 0; i < resultCode.length(); i++) {
			// 将认证码显示到图象中,调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
			// graphics.setColor(new Color(20 + random.nextInt(130), 20 + random
			// .nextInt(130), 20 + random.nextInt(130)));

            // 设置字体颜色
			graphics.setColor(Color.BLACK);
            // 设置字体样式
//			graphics.setFont(new Font("Arial Black", Font.ITALIC, 18));
            graphics.setFont(new Font("Times New Roman", Font.BOLD, 24));
            // 设置字符，字符间距，上边距
			graphics.drawString(String.valueOf(resultCode.charAt(i)), (18 * i) + 6, 26);
		}

		System.out.println(request.getSession().getId() + "验证码："+resultCode);
		// 将认证码存入SESSION 转为大写的字母
		request.getSession().setAttribute(SESSION_KEY_OF_RAND_CODE, resultCode.toUpperCase());
		// 图象生效
		graphics.dispose();

		// 输出图象到页面
		ImageIO.write(image, "JPEG", response.getOutputStream());
	}

	/**
	 * @return 随机码
	 */
	private static String exctractRandCode() {
		int randCodeType = randcodetype;
        int randCodeLength = randcodelength;
        //if (randCodeType == null) {
			//return RandCodeImageEnum.NUMBER_CHAR.generateStr(randCodeLength);
		//} else {
			switch (randCodeType) {
			case 1:
				return RandCodeImageEnum.NUMBER_CHAR.generateStr(randCodeLength);
			case 2:
				return RandCodeImageEnum.LOWER_CHAR.generateStr(randCodeLength);
			case 3:
				return RandCodeImageEnum.UPPER_CHAR.generateStr(randCodeLength);
			case 4:
				return RandCodeImageEnum.LETTER_CHAR.generateStr(randCodeLength);
			case 5:
				return RandCodeImageEnum.ALL_CHAR.generateStr(randCodeLength);
			default:
				return RandCodeImageEnum.NUMBER_CHAR.generateStr(randCodeLength);
			}
		//}
	}

	/**
	 * 描述：
	 * 
	 * @param fc
	 *            描述：
	 * @param bc
	 *            描述：
	 * 
	 * @return 描述：
	 */
	private static Color getRandColor(int fc, int bc) { // 取得给定范围随机颜色
		final Random random = new Random();
		if (fc > 255) {
			fc = 255;
		}
		if (bc > 255) {
			bc = 255;
		}

		final int r = fc + random.nextInt(bc - fc);
		final int g = fc + random.nextInt(bc - fc);
		final int b = fc + random.nextInt(bc - fc);

		return new Color(r, g, b);
	}
	
	public static void main(String[] args) {
		System.out.println(RandCodeImageEnum.ALL_CHAR.generateStr(6));
	}
}

/**
 * 验证码辅助类
 * 
 * @author 张国明 guomingzhang2008@gmail.com <br/>
 *         2012-2-28 下午2:15:14
 * 
 */
enum RandCodeImageEnum {
	/**
	 * 混合字符串
	 */
	// modi by weibin 删除容易混淆的字母或数字
	//ALL_CHAR("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"),
	ALL_CHAR("123456789abcdefghijkmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ"),
	/**
	 * 字符
	 */
	LETTER_CHAR("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"),
	/**
	 * 小写字母
	 */
	LOWER_CHAR("abcdefghijklmnopqrstuvwxyz"),
	/**
	 * 数字
	 */
	NUMBER_CHAR("0123456789"),
	/**
	 * 大写字符
	 */
	UPPER_CHAR("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	/**
	 * 待生成的字符串
	 */
	private String charStr;

	/**
	 * @param charStr
	 */
	private RandCodeImageEnum(final String charStr) {
		this.charStr = charStr;
	}

	/**
	 * 生产随机验证码
	 * 
	 * @param codeLength
	 *            验证码的长度
	 * @return 验证码
	 */
	public String generateStr(final int codeLength) {
		final StringBuffer sb = new StringBuffer();
		final Random random = new Random();
		final String sourseStr = getCharStr();

		for (int i = 0; i < codeLength; i++) {
			sb.append(sourseStr.charAt(random.nextInt(sourseStr.length())));
		}

		return sb.toString();
	}

	/**
	 * @return the {@link #charStr}
	 */
	public String getCharStr() {
		return charStr;
	}

}