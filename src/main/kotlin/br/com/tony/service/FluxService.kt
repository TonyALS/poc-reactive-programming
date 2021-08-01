package br.com.tony.service

import reactor.core.publisher.Flux

class FluxService {
    fun numbersList(): Flux<Int> = Flux.just(1, 2, 3)
    fun returnStringA(): Flux<String> = Flux.just("Essa é a string A")
    fun returnStringB(): Flux<String> = Flux.just("Essa é a string B")
    fun returnStringC(): Flux<String> = Flux.just("Essa é a string C")
}