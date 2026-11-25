import java.util.Scanner;

void main(String[] args) {
    Scanner sca= new  Scanner (System.in);
    System.out.println("digitei sua idade: ");
    int idade = sca.nextInt();
    System.out.println("sua altura: ");
    float altu = sca.nextFloat();
    System.out.println("seu peso: ");
    double pes = sca.nextDouble();

    System.out.println("seu idade: "+ idade);
    System.out.println("seu altura: "+ altu);
    System.out.println("seu peso: "+ pes);
}