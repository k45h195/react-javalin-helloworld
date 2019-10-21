import io.javalin.Javalin

fun main(args: Array<String>){
    val app = Javalin.create{config -> config.addStaticFiles("/public")}.start(8080)
}
