// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


const val MinUI = UInt.MIN_VALUE
const val MinUB = UByte.MIN_VALUE
const val MinUS = UShort.MIN_VALUE
const val MinUL = ULong.MIN_VALUE

fun box(): String {
    val list1 = ArrayList<UInt>()
    for (i in MinUI..MinUI step 1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<UInt>(MinUI)) {
        return "Wrong elements for MinUI..MinUI step 1: $list1"
    }

    val list2 = ArrayList<UInt>()
    for (i in MinUB..MinUB step 1) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<UInt>(MinUB.toUInt())) {
        return "Wrong elements for MinUB..MinUB step 1: $list2"
    }

    val list3 = ArrayList<UInt>()
    for (i in MinUS..MinUS step 1) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<UInt>(MinUS.toUInt())) {
        return "Wrong elements for MinUS..MinUS step 1: $list3"
    }

    val list4 = ArrayList<ULong>()
    for (i in MinUL..MinUL step 1) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<ULong>(MinUL)) {
        return "Wrong elements for MinUL..MinUL step 1: $list4"
    }

    return "OK"
}
