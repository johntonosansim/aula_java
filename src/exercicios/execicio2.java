static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o seu salario: ");
    int sal = scan.nextInt();
    System.out.println("e sua hora trabalhando: ");
    float hor = scan.nextFloat();

   float rel = sal*hor;

    System.out.println("seu resultando e: "+ rel);
}