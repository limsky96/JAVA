import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class Java_09_lotto {
    public static void main(String[] args) {
        Set<Integer> lottoNumbers = LottoNumbers();

        System.out.println("로또 번호: " + lottoNumbers);
        
        //Set<Integer> lotto = new HashSEt<Integer>();
        //while(lotto.size() !=6){
        //	int num = (int) (Math.random()*45)+1;
       //	lotto.add(num);}
        //sout(lotto);
    }

    public static Set<Integer> LottoNumbers() {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int number = random.nextInt(45) + 1; // 1부터 45 사이의 랜덤 수 생성
            lottoNumbers.add(number);
        }

        return lottoNumbers;
    }
}

