package session5;

public class IfStatement {

    public static void main(String[] args) {

        // ==========================================
        // 1. IF STATEMENT
        // ==========================================

        int currentYear = 2026;
        int birthYear = 1995;
        int age = currentYear - birthYear;

        // Instrucțiunea din interiorul blocului if se execută
        // doar dacă expresia condițională este adevărată (true).
        //
        // Dacă vârsta este mai mare decât 18, persoana este majoră.
        if (age > 18) {
            System.out.println("Persoana este majora.");
        }


        // ==========================================
        // 2. IF-ELSE STATEMENT
        // ==========================================

        birthYear = 2015;
        age = currentYear - birthYear;

        // Dacă vârsta este mai mare decât 18, se execută blocul if.
        // În caz contrar, se execută blocul else.
        //
        // Doar unul dintre cele două blocuri va fi executat.
        if (age > 18) {
            System.out.println("Persoana este majora.");
        } else {
            System.out.println("Persoana este minora.");
        }


        // ==========================================
        // 3. IF-ELSE IF-ELSE STATEMENT
        // ==========================================

        birthYear = 2008;
        age = currentYear - birthYear;

        // Putem verifica mai multe condiții folosind else if.
        // Java verifică aceste condiții în ordine, de sus în jos.
        //
        // Prima condiție adevărată determină blocul care va fi executat.
        // Dacă nicio condiție nu este adevărată, se execută blocul else.
        if (age > 18) {
            System.out.println("Persoana este majora.");
        } else if (age == 18) {
            System.out.println("Persoana are exact 18 ani.");
        } else {
            System.out.println("Persoana este minora.");
        }


        // ==========================================
        // 4. MULTIPLE IF STATEMENTS
        // ==========================================

        // Spre deosebire de if-else if, fiecare instrucțiune if
        // este evaluată independent.
        //
        // Mai multe blocuri if pot fi executate dacă mai multe
        // condiții sunt adevărate.

        if (age > 18) {
            System.out.println("Persoana are peste 18 ani.");
        }

        if (age == 18) {
            System.out.println("Persoana are exact 18 ani.");
        }

        if (age < 18) {
            System.out.println("Persoana are sub 18 ani.");
        }


        // ==========================================
        // 5. NESTED IF STATEMENTS
        // ==========================================

        int weight = 113;

        // Un if poate conține alte instrucțiuni if.
        // Acestea se numesc Nested if statements.
        //
        // Condițiile interioare sunt verificate doar dacă
        // este îndeplinită condiția blocului exterior.

        if (weight > 100) {

            System.out.println("Greutatea este mai mare de 100 kg.");

            // Verificăm dacă greutatea depășește 150 kg.
            if (weight > 150) {
                System.out.println("Greutatea este mai mare de 150 kg.");
            } else {
                System.out.println("Greutatea nu depășește 150 kg.");
            }

            // Această condiție este verificată independent
            // de rezultatul primului if interior.
            if (weight > 130) {
                System.out.println("Greutatea este mai mare de 130 kg.");
            } else {
                System.out.println("Greutatea nu depășește 130 kg.");
            }

            // Verificăm încă o condiție în interiorul blocului exterior.
            if (weight > 110) {
                System.out.println("Greutatea este mai mare de 110 kg.");
            }

        }


        // ==========================================
        // 6. IF-ELSE IF-ELSE WITH MULTIPLE CONDITIONS
        // ==========================================

        int temperature = 35;

        // Verificăm temperatura și alegem îmbrăcămintea potrivită.
        //
        // Condițiile sunt evaluate de sus în jos.
        // Se execută doar primul bloc pentru care condiția este adevărată.
        //
        // Ordinea condițiilor este importantă:
        // dacă temperatura este 35, prima condiție este deja adevărată,
        // iar restul condițiilor nu mai sunt evaluate.

        if (temperature > 30) {
            System.out.println("Este foarte cald. Imi iau un tricou.");
        } else if (temperature > 20) {
            System.out.println("Este cald. Imi iau un pulover subtire.");
        } else if (temperature >= 10) {
            System.out.println("Este racoare. Imi iau o geaca.");
        } else {
            System.out.println("Este foarte frig. Mai bine stau acasa.");
        }

    }
}