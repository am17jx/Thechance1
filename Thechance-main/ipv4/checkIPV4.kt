fun main() {

        check(
            name = "ValidIPv4Address",
            result = ip("192.168.1.1"),
            correct = true
        )

        check(
            name = "Valid-Zero Only IPv4 Address",
            result = ip("0.0.0.0"),
            correct = true
        )

        check(
            name = "Valid Max Number Only IPv4 Address",
            result = ip("255.255.255.255"),
            correct = true
        )

        check(
            name = "ValidWithNumberIPv4Address",
            result = ip("1.2.3.4"),
            correct = true
        )

        // Invalid IP tests
        check(
            name = "fakeInvalidOutRangeNumbersIPv4Address",
            result = ip("192.300.1.-1"),
            correct = false
        )

        check(
            name = "InvalidNotFourSegmentsIPv4Address",
            result = ip("193.255.1"),
            correct = false
        )


        check(
            name = "Invalid nonAllowed Chars IPv4Address",
            result = ip("1h7.49j.-23.@"),
            correct = false
        )

        check(
            name = "Invalid empty IPv4Address",
            result = ip(" "),
            correct = false
        )

        check(
            name = "Invalid double .. IPv4Address",
            result = ip("192..168.1.1"),
            correct = false
        )

        check(
            name = "Invalid space IPv4Address",
            result = ip(" 192.168.1.1"),
            correct = false
        )

        check(
            name = "Invalid many segment IPv4Address",
            result = ip("192.168.1.1.1"),
            correct = false
        )

        check(
            name = "Invalid 256 out IPv4Address",
            result = ip("256.168.1.9"),
            correct = false
        )

        check(
            name = "Invalid non-numeric IPv4Address",
            result = ip("256.168.1.z"),
            correct = false
        )
    }



    fun check(name:String,result: Boolean,correct:Boolean){


    if (result == correct){

        println("success - $name")
    }
    else{
        println("failed- $name")
    }
}
