/*public class parseint {
    public static void main(String args[]) {
        int a = 8, b = 3;
        if (args.length >= 2) {       
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }
        int c;

        char C = 'a', g;

        float h = 2.3f, i;
        b = (int)(a + h);

        System.out.println(5 / 2.2);
        System.out.println(a + " + " + h + " = " + b);
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        boolean d, e, f;
        e = true;
        f = false;
        d = e && f;
        System.out.println(e + " && " + f + " = " + d);
        d = e || f;
        System.out.println(e + " || " + f + " = " + d);
        c = a & b;
        System.out.println(a + " & " + b + " = " + c);
        c = a | b;
        System.out.println(a + " | " + b + " = " + c);
        c = a ^ b; //exclusive xor diffe unte 1 else 0
        System.out.println(a + " ^ " + b + " = " + c);
        c = a << b;
        System.out.println(a + " << " + b + " = " + c);
        c = a >> b;
        System.out.println(a + " >> " + b + " = " + c);
        b = 2;
        a = 16;
        c = a >>> b;
        System.out.println(a + " >>> " + b + " = " + c);

        System.out.println(" ~ " + b + " = " + ~b); //bitwise compliment operator 1 to 0 amd 0 to 1 and add 1 for twos compliment
        System.out.println(" !" + e + " = " + !e); 

        a += b;
        System.out.println(a + " += " + b + " = " + a);
        a *= b;
        System.out.println(a + " *= " + " = " + a);
        a /= b;
        System.out.println(a + " /= " + " = " + a);
        a -= b;
        System.out.println(a + " -= " + " = " + a);


        a &= b;
        System.out.println(a + " & = " + b + " = " + a);
        a |= b;
        System.out.println(a + " | = " + b + " = " + a);
        a ^= b;
        System.out.println(a + " ^= " + b + " = " + a);
        a <<= b;
        System.out.println(a + " <<= " + b + " = " + a);
        a >>= b;
        System.out.println(a + " >> = " + b + " = " + a);
        b = 2;
        a = 16;
        a >>>= b;
        System.out.println(a + " >>> = " + b + " = " + a);
        if (Character.isUpperCase(C)) {
            System.out.println("The character " + C + " is upper case.");
        } else {
            System.out.println("The character " + C + " is lower case.");
        }
        System.out.println("The value of aBoolean is " + a);
    }
}*/
/*import javax.swing.JOptionPane;
class parseint
{
public static void main(String args[])
{
int x,y;
int z;
x=Integer.parseInt(JOptionPane.showInputDialog("enter the a value"));
y=Integer.parseInt(JOptionPane.showInputDialog("enter the a value"));
Object[] options = {"Yes", "No", "Cancel"};
int result = JOptionPane.showOptionDialog(null, "Choose an option:", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
System.out.println(result);


z=x+y;
System.out.println(" "+z);
}
} */  
// The program prompts the user twice to enter integer values using input dialog boxes.
// It then adds these values together and prints the result to the console.
// The program demonstrates how to interact with users through input dialog boxes and perform basic arithmetic operations based on the input provided by the user.
// import javax.swing.JOptionPane;: This imports the JOptionPane class from the javax.swing package. JOptionPane provides methods to create and manage dialog boxes for user input and messages.
/*class parseint {
    public static void main(String arg[]) {
        if (arg.length < 1) {
            System.out.println("Usage: java prim <number>");
            return; // Exit the program if no command-line argument is provided
        }
        
        int x, i, j, count = 0;
        boolean flag;
        j = Integer.parseInt(arg[0]);
        
        for (x = 2; x <= j; x++) {
            flag = false;
            for (i = 2; i <= x / 2; i++) {
                count++;
                if (x % i == 0) {
                    flag = true;
                    break; // No need to continue checking if x is divisible by i
                }
            }
            if (!flag) {
                System.out.println(" " + x);
            }
        }
        System.out.println(" " + count);
    }
}*/
