public class CompteController {
    displqyCreqteQccountMenu{
        do {
            System.out.println("1 => cretae current account");
            System.out.println("2 => create saving account");
            System.out.println("3 => return");
            accType = scanner.nextInt();
            switch (accType) {
                case 1 :
                    double sold , overdraft;
                    do {
                        System.out.println("please entre sold (de 0 a ****)");
                        sold = scanner.nextDouble();
                    }while (sold < 0);
                    do {
                        System.out.println("please entre your overdraft (de 0 a ****)");
                        overdraft = scanner.nextDouble();
                    } while (overdraft <0);
                    CompteCourant compteCourant = new CompteCourant(sold, overdraft);
                    CompteCourant.create(compteCourant);
                    break;
                case 2 :
                    System.out.println("saving account");
                    break;
                default:
                    System.out.println("invalide choice !! please enter valide choice");
                    break;
            }
        }while (accType != 3);
    }
}
