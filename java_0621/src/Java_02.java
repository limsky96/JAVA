// TV
class TV{
	String brand; // datamember
	int year;
	int inch;
	
	TV(String brand, int year, int inch){ // 생성자
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand + "에서 만든" + year + "년형" + inch + "인치 TV");
	}
}
//가수 
class SONG{
	int year;
	String title;
	String artist;
	String country;
	
	SONG(int year, String country, String artist, String title){
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	void song2() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
}



public class Java_02 {
	public static void main(String[] args) {

			//LG 에서 만든 2017년형 32인치 TV
        	TV myTV = new TV("LG", 2017, 32);
        	myTV.show();
        	
        	// 가수 
        	SONG sing = new SONG(1978, "스웨덴", "ABBA", "Dancing Queen");
        	sing.song2();
        	
        
	}

}
