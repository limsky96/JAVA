


class TV{
   private int size;
   public TV(int size) { this.size = size; }
   public int getSize() { return size; }
}

class ColorTV extends TV {
	   private int resolution;
	   
	   public ColorTV(int size, int resolution) {
	      super(size);
	      this.resolution = resolution;
	   }
	   
	   public void printProperty() {
	      System.out.println("size: " + getSize() + "인치");
	      System.out.println("해상도 : " + resolution + " 컬러");
	   }
	}

// 2048컬러 
class IPTV extends ColorTV {
	   private String ipTv;
	   
	   public IPTV(String ipTv, int size, int resolution) {
	      super(size, resolution);
	      this.ipTv = ipTv;
	   }
	   
	   public void printProperty() {
	      super.printProperty();
	      System.out.println("IP TV: " + ipTv);
	   }
	}

public class Java_07_TV {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		// 2048컬러 
		  IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
	      iptv.printProperty();
	}

}
