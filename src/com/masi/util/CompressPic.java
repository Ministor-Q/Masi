package com.masi.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 *  压缩图片
 *  @param InputStream
 *  @return BufferedImage
 * @author wangqi-1
 */
public class CompressPic {

    // 图片处理 
    public BufferedImage compressPic(InputStream is, int width, int height,
            boolean gp) {
        try {
            //获得源文件 
            BufferedImage img = javax.imageio.ImageIO.read(is);
            // 判断图片格式是否正确 
            if (img.getWidth(null) == -1) {
                System.out.println(" can't read,retry!" + "<BR>");
                return null;
            } else {
                int newWidth;
                int newHeight;
                // 判断是否是等比缩放 
                if (gp == true) {
                    // 为等比缩放计算输出的图片宽度及高度 
                    double rate1 = ((double) img.getWidth(null))
                            / (double) width + 0.1;
                    double rate2 = ((double) img.getHeight(null))
                            / (double) height + 0.1;
                    // 根据缩放比率大的进行缩放控制 
                    double rate = rate1 > rate2 ? rate1 : rate2;
                    newWidth = (int) (((double) img.getWidth(null)) / rate);
                    newHeight = (int) (((double) img.getHeight(null)) / rate);
                } else {
                    newWidth = width; // 输出的图片宽度 
                    newHeight = height; // 输出的图片高度 
                }
                BufferedImage tag = new BufferedImage((int) newWidth,
                        (int) newHeight, BufferedImage.TYPE_INT_RGB);

                /*
                 * Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 优先级比速度高 生成的图片质量比较好 但速度慢
                 */

                Image image = img.getScaledInstance(newWidth, newHeight,
                    Image.SCALE_SMOOTH);
                tag.getGraphics().drawImage(image, 0, 0, null);
                // Image image =img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

                return tag;
            }
        } catch (IOException ex) {

        }
        return null;
    }

}