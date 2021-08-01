import br.com.tony.service.FluxService
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

fun main(args: Array<String>) {
    val fluxService = FluxService()

    val flux1 = Flux.just(3)
    val flux2 = Flux.just(6)
    val number = Flux.just(1, 2)

    val flux = number
        .filter { it > 2 }
        .doOnNext { printString("String A") }
        .switchIfEmpty(flux1)
        .filter { it == 3 }
        .doOnNext { printString("String B") }
        .switchIfEmpty { printString("passou por todos") }
        .subscribe()
}

private fun printString(s: String) {
    Mono.just(println(s))
}

