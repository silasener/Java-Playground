import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullanıcıGirisi extends JFrame{
    private JButton girisYapButton;
    private JPanel AnaPanal;
    private JTextField kullanıcıadı_field;
    private JPasswordField kullanıcısifre_field;
    private JLabel kullanıcıadı_label;
    private JLabel sifrel_abel;


    public KullanıcıGirisi() {
        setContentPane(AnaPanal);
        setTitle("İsim şifre uygulaması");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
        girisYapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullanıcıadi=kullanıcıadı_field.getText();
              String parola= new String(kullanıcısifre_field.getPassword());

              String uyarı;
              if (kullanıcıadi.equals("Emre Terzi") && parola.equals("123456")){

                  uyarı="HOŞGELDİN "+kullanıcıadi;
              }
                 else if (!kullanıcıadi.equals("Emre Terzi")&& parola.equals("123456")){

                    uyarı="Kullanıcı adınız yanlış";

                }
                else if (kullanıcıadi.equals("Emre Terzi")&& !parola.equals("123456")){

                    uyarı="Şifreniz hatalı";


                }
                else{
                    uyarı="kullanıcı adı ve şifreniz hatalı";


                }
                JOptionPane.showMessageDialog(girisYapButton,uyarı);

            }
        }  );
    }
    public static void main(String[] args){


        KullanıcıGirisi kullanıcıGirisi1=new KullanıcıGirisi();




    }
}

