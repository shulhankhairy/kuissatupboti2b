package Quiz;

public class Mesin {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void status(String Merek){
        System.out.println("Merek Mobil: " + Merek);
        if (this.kontakOn)
            System.out.println("On");
        else
            System.out.println("Off");
        System.out.println("Current Speed: " + kecepatan);
    }

    public boolean isKontakOn() {
        return kontakOn;
    }

    public void onMesin(){
        kontakOn = true;
    }

    public void offMesin(){
        kontakOn = false;
    }

    public void addSpeed(String Merek){
        switch (Merek){
            case "Ferrari":
                this.kecepatan += 30;
                if (kecepatan >= 430)
                    System.out.println("Batas Kecepatan");
                break;
            case "Renault":
                this.kecepatan += 55;
                if (kecepatan >= 385)
                    System.out.println("Batas Kecepatan");
                break;
            case "Mercedes":
                this.kecepatan += 65;
                if (kecepatan >= 430)
                    System.out.println("Batas Kecepatan");
                break;
            case "Lorena":
                this.kecepatan += 150;
                if (kecepatan > 1500)
                    System.out.println("Batas Kecepatan");
                break;
        }
    }

    public void deleteSpeed(String Merek){
        switch (Merek){
            case "Ferrari":
                this.kecepatan -= 10;
                if (this.kecepatan < 0)
                    System.out.println("Beri kecepatan dahulu");
                break;
            case "Renault":
                this.kecepatan -= 20;
                if (this.kecepatan < 0)
                    System.out.println("Beri kecepatan dahulu");
                break;
            case "Mercedes":
                this.kecepatan -= 35;
                if (this.kecepatan < 0)
                    System.out.println("Beri kecepatan dahulu");
                break;
            case "Lorena":
                this.kecepatan -= 1000;
                if (kecepatan < 0)
                    System.out.println("Beri kecepatan dahulu");
                break;
        }
    }
}