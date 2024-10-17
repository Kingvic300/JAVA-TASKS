import java.util.Arrays; 
public class Pixel{
	public static void main(String[] args){
		int[] pixels = {13,26,57,99,89,78,38,182,23,123};

		for(int count = 0;count<pixels.length;count++){

			if(pixels[count] >= 0 && pixels[count] <= 20){
				pixels[count] = 10;

			}else if(pixels[count] >= 21 && pixels[count] <= 40){
				pixels[count] = 30;

			}else if(pixels[count] >= 41 && pixels[count] <= 60){
				pixels[count] = 50;

			}else if(pixels[count] >= 61 && pixels[count] <= 80){
				pixels[count] = 70;

			}else if(pixels[count] >= 81 && pixels[count] <= 100){
				pixels[count] = 90;

			}else if(pixels[count] >= 101 && pixels[count] <= 120){
				pixels[count] = 110;

			}else if(pixels[count] >= 121 && pixels[count] <= 140){
				pixels[count] = 130;
	
			}else if(pixels[count] >= 141 && pixels[count] <= 160){
				pixels[count] = 150;
	
			}else if(pixels[count] >= 161 && pixels[count] <= 180){
				pixels[count] = 170;

			}else if(pixels[count] >= 181 && pixels[count] <= 200){
				pixels[count] = 190;
			}
		}
			System.out.print(Arrays.toString(pixels));
	}
}