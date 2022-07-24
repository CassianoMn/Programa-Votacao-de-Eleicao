package eleicao;
import javax.swing.JOptionPane;
public class Eleicao { 
    public static void main(String[] args) {
        int totL, totB, totVotos, voto, totNulo; float totlula, totbolso, pB, pL;
        totL = 0; totB = 0; totVotos = 0; totNulo = 0; totbolso = 0; totlula = 0;
        
        do {
        voto = Integer.parseInt(JOptionPane.showInputDialog("<html>[1]  p/ votar "
                + "no Bolsonaro " + "<br>[2]  p/ votar no Lula"
                + "<br>[0] interrompe a votação" + "<br>Digite sua opção: <html/>"));
                totVotos++;
        switch(voto) {
            case 1 -> totB++;
            case 2 -> totL++;
            case 0 -> JOptionPane.showMessageDialog(null, "<html>Fim de votação!" + 
                    "<br>Clique em 'Ok' para ver o resultado final " + "<html/>", "Encerrou!", JOptionPane.INFORMATION_MESSAGE);
            default -> totNulo++; 
        }
        } while (voto !=0);
        totlula = totL; totbolso = totB;
        totVotos--;
        pL = (totlula/totVotos*100); pB = (totbolso/totVotos*100);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr> " + 
                "<br>Total de votos para Bolsonaro: " + totB +
                "<br>Total de votos para Lula: " + totL 
                + "<br>Total de votos nulos: " + totNulo + "<br>Votos Totais: "
                + totVotos + "<html/>", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        if (totL > totB) {
            JOptionPane.showMessageDialog(null, "<html>LULA É O VENCEDOR!" +
            "<br>" + "<br>Percentual dos votos: " + pL + "%" + "<html/>");
        } else  if (totL < totB) {
            JOptionPane.showMessageDialog(null,"<html>BOLSONARO É O VENCEDOR!" +
                   "<br>" + "<br>Percentual dos votos: " + pB + "%" + "<html/>");
        } else {
            JOptionPane.showMessageDialog(null, "NENHUM VENCEDOR!");
        }
        
    }
    
}
