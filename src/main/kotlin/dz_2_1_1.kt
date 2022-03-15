fun main() {
    val type = "Vk Pay"
    val newTranz: Int = 1000_00
    val lastSutTranz = 8000_00 //Сумма предыдущих переводов за данные сутки
    val lastTranz = 30000_00 //Сумма предыдущих переводов за данный месяц

    if (calculatePrice(type, lastTranz, lastSutTranz, newTranz) == -1)
        println("Перевод невозможен")
    else
        println("Комиссия за перевод: " + calculatePrice(type, lastTranz, lastSutTranz, newTranz) + " коп.")
}

fun calculatePrice(type: String = "Vk Pay", lastTranz: Int = 0, lastSutTranz: Int, tranz: Int): Int {
    val res: Double = when {
        type == "Vk Pay" && correct(type, lastTranz, lastSutTranz, tranz) -> 0.0
        (type == "MasterCard" || type == "Maestro") && correct(
            type,
            lastTranz,
            lastSutTranz,
            tranz
        ) -> if (tranz + lastSutTranz + lastTranz <= 75000_00) 0.0
        else 0.006 * tranz + 20_00
        (type == "Visa" || type == "Мир") && correct(
            type,
            lastTranz,
            lastSutTranz,
            tranz
        ) -> if (tranz * 0.0075 <= 35_00) 35.0 else tranz * 0.0075
        else -> -1.0
    }
    return kotlin.math.round(res).toInt()
}

fun correct(type: String, lastTranz: Int, lastSutTranz: Int, tranz: Int): Boolean {
    if (type == "Vk Pay") {
        if (tranz > 15000_00) {
            println("Превышен разовый лимит перевода по системе $type")
            return false
        }
        if (tranz + lastTranz + lastSutTranz > 40000_00) {
            println("Превышен месячный лимит переводов по системе $type")
            return false
        }
    } else
        if (tranz + lastSutTranz > 150000_00) {
            println("Превышен суточный лимит переводов по карте $type")
            return false
        }
    if (tranz + lastSutTranz + lastTranz > 600000_00) {
        println("Превышен месячный лимит переводов по карте $type")
        return false
    }
    return true
}