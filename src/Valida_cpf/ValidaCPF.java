/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Valida_cpf;
import BLL.FuncionariosBLL;
import DTO.FuncionariosDTO;
import static Telas.Cadastro_Funcionarios.tb_funcoionario;
import java.util.InputMismatchException;


/**
 *
 * @author Administrador
 */
public class ValidaCPF {
 
   public static boolean isCPF(String txt_cpf) {
// considera-se erro CPF's formados por uma sequencia de numeros iguais
    if (txt_cpf.equals("00000000000") || txt_cpf.equals("11111111111") ||
        txt_cpf.equals("22222222222") || txt_cpf.equals("33333333333") ||
        txt_cpf.equals("44444444444") || txt_cpf.equals("55555555555") ||
        txt_cpf.equals("66666666666") || txt_cpf.equals("77777777777") ||
        txt_cpf.equals("88888888888") || txt_cpf.equals("99999999999") ||
       (txt_cpf.length() != 11))
       return(false);

    char dig10, dig11;
    int sm, i, r, num, peso;

// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
    try {
// Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 10;
      for (i=0; i<9; i++) {              
// converte o i-esimo caractere do CPF em um numero:
// por exemplo, transforma o caractere '0' no inteiro 0         
// (48 eh a posicao de '0' na tabela ASCII)         
        num = (int)(txt_cpf.charAt(i) - 48); 
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig10 = '0';
      else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

// Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 11;
      for(i=0; i<10; i++) {
        num = (int)(txt_cpf.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig11 = '0';
      else dig11 = (char)(r + 48);

// Verifica se os digitos calculados conferem com os digitos informados.
      if ((dig10 == txt_cpf.charAt(9)) && (dig11 == txt_cpf.charAt(10)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }

  public static String imprimeCPF(String txt_cpf) {
    return(txt_cpf.substring(0, 3) + "." + txt_cpf.substring(3, 6) + "." +
      txt_cpf.substring(6, 9) + "-" + txt_cpf.substring(9, 11));
  }
}
