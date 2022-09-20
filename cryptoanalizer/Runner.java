public class Runner {
    public static void main(String[] args) throws IOException {


        Scanner consoleText = new Scanner(System.in);
        System.out.println("Здравствуйте! Вас приветствует крипто Цезарь. \n" +
                "Задача этой программы в шифровании и дешифровании текстов \n" +
                "1 - Шифрование текста по методу Цезаря\n" +
                "2 - Расшифрование текста по методу Цезаря\n" +
                "3 - Криптоанализ текста  метод Brute force(поиск грубой силы)\n" +
                "exit - прекращение работы программы");
        System.out.println();
        System.out.println("Вам необходимо выбрать метод");


        while (consoleText.hasNextLine()) {
            String question = consoleText.nextLine();
            if (question.equals("1")) {
                fileAddressRequestForEncryption();
                break;
            } else if (question.equals("2")) {
                fileAddressRequestForDecryption();
                break;
            } else if (question.equals("3")) {
                    fileAddressRequestForBruteForce();
                    break;
                }
                } else {
                    System.out.println("Вы ввели не допустимые значения");
                }
            }
            else if (question.equals("exit")){
                break;
            }
            System.out.println("Вы ввели не допустимые значения");


        }
    }
}


}
