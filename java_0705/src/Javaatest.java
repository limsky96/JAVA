import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class Java_lotto {
    public static void main(String[] args) {
        Set<Integer> lottoNumbers = LottoNumbers();

        System.out.println("로또 번호: " + lottoNumbers);
         }

    public static Set<Integer> LottoNumbers() {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int number = random.nextInt(45) + 1; 
            lottoNumbers.add(number);
        }

        return lottoNumbers;
    }

