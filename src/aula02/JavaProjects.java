package aula02;

import javax.swing.JOptionPane;


public class JavaProjects {

  public static void main(String[] args) {
    //ImparOuPar();
    //PesoIdeal();
    //SomaNum();
    //MediaNotas();
    //AreaTriangulo();
    //AreaCirculo();
    //CalculaNum();
    NovoPrecoProduto();
    //SalarioBase();
    //AumentoSalario();
  }
  
public static void ImparOuPar(){
    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
    if(num%2==0){
        JOptionPane.showMessageDialog(null, "O número "+num+" é Par.");
    }else{
        JOptionPane.showMessageDialog(null, "O número "+num+" é Ímpar.");
    }
}


public static void PesoIdeal(){
    double h;
    char sexo;
    h = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura:"));
    sexo = JOptionPane.showInputDialog("Digite o sexo:").charAt(0);
        if ((sexo == 'M') || (sexo == 'm')){
         JOptionPane.showMessageDialog(null, "Masculino: Seu peso ideal é "+((72.7*h)-50));
        } else if ((sexo == 'F') || (sexo == 'f')){
          JOptionPane.showMessageDialog(null, "Feminino: Seu peso ideal é "+((62.1*h)-44.7));                 
        } else {
          JOptionPane.showMessageDialog(null, "Sexo errado!");
        }
}


public static void MediaNotas(){
    float[] nums = new float[3];
    nums[0] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota"));
    nums[1] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a segunda nota"));
    nums[2] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a terceira nota"));
    float media = 0;
    for (int i = 0; i < nums.length; i++){
        media += nums[i];
    }
    float total = media/ nums.length;
    JOptionPane.showMessageDialog(null, "A média total é igual a " + total);
    }

public static void AreaTriangulo(){
    float area, base, altura;
    base = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a base do triângulo:"));
    altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a altura do triângulo:"));
    
    area = (base*altura)/2;
    JOptionPane.showMessageDialog(null, "A área do triângulo é igual a " + area);
}

public static void AreaCirculo() {
    double pi = 3.14159, raio;
    raio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o raio do círculo:"));
    double area = Math.pow(raio, 2)*pi;
    JOptionPane.showMessageDialog(null, "A área do círculo é igual a " + area);
}

public static void CalculaNum(){
    double num;
    num = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número positivo"));
    if (num > 0) {JOptionPane.showMessageDialog(null, num 
            + " ao quadrado é igual a " + (Math.pow(num, 2))
            + ", ao cubo é igual a " + (Math.pow(num, 3)) 
            + " e a sua raiz é igual a " + (Math.sqrt(num)));
    } else {JOptionPane.showMessageDialog(null,"Por favor, informe um número positivo!");}
       
}

public static void NovoPrecoProduto(){
    double preco; 
    preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor atual do produto:"));
    JOptionPane.showMessageDialog(null, "O novo valor do produto é igual a "+((preco * 0.90)));
}

public static void SalarioBase(){
    double salarioBase, gratificacao, salarioComImposto, totalSalario; 
    salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do salário:"));
    gratificacao = salarioBase * 0.05;
    salarioComImposto = salarioBase - (salarioBase * 0.07);
    totalSalario = gratificacao + salarioComImposto;
    JOptionPane.showMessageDialog(null, "O salário final do funcionário é igual a "+totalSalario);
}

public static void AumentoSalario(){
     double salario;
     salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do salário:"));
     percent = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o percentual de aumento:"));
}
}
