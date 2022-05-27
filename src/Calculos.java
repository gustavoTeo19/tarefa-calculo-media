public class Calculos {
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    Calculos(float n1, float n2, float n3, float n4){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;
    }
    public float calcularMedia(){
        return (nota1 + nota2 + nota3 + nota4) /4;
    }
}
