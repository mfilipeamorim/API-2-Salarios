package api2

class Cidade {

    String nome


    static mapping = {
        id generator: "increment"
        version false
    }

    static constraints = {
        nome nullable: false, maxSize: 50
    }
}
