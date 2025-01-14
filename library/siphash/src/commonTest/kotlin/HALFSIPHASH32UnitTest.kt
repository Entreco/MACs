package org.kotlincrypto.macs.siphash

import org.kotlincrypto.core.mac.Mac
import org.kotlincrypto.macs.SiphashUnitTest
import kotlin.test.Test

@OptIn(ExperimentalUnsignedTypes::class)
open class HALFSIPHASH32UnitTest : SiphashUnitTest() {

    final override val validKey: ByteArray = ByteArray(8) { it.toByte() }
    final override val expectedAlgorithm: String = "Half-SipHash"
    final override val expectedResetHash: String = "a9359f5b"
    final override val expectedUpdateSmallHash: String = "796be56a"
    final override val expectedUpdateMediumHash: String = "9561907b"

    override fun mac(key: ByteArray): Mac = HALFSIPHASH32(key)

    /**
     * @See [https://github.com/veorq/SipHash/blob/master/vectors.h]
     */
    final override val expectedHashes: List<UByteArray> = listOf(
        ubyteArrayOf(0xa9U, 0x35U, 0x9fU, 0x5bU),
        ubyteArrayOf(0x27U, 0x47U, 0x5aU, 0xb8U),
        ubyteArrayOf(0xfaU, 0x62U, 0xa6U, 0x03U),
        ubyteArrayOf(0x8aU, 0xfeU, 0xe7U, 0x04U),
        ubyteArrayOf(0x2aU, 0x6eU, 0x46U, 0x89U),
        ubyteArrayOf(0xc5U, 0xfaU, 0xb6U, 0x69U),
        ubyteArrayOf(0x58U, 0x63U, 0xfcU, 0x23U),
        ubyteArrayOf(0x8bU, 0xcfU, 0x63U, 0xc5U),
        ubyteArrayOf(0xd0U, 0xb8U, 0x84U, 0x8fU),
        ubyteArrayOf(0xf8U, 0x06U, 0xe7U, 0x79U),
        ubyteArrayOf(0x94U, 0xb0U, 0x79U, 0x34U),
        ubyteArrayOf(0x08U, 0x08U, 0x30U, 0x50U),
        ubyteArrayOf(0x57U, 0xf0U, 0x87U, 0x2fU),
        ubyteArrayOf(0x77U, 0xe6U, 0x63U, 0xffU),
        ubyteArrayOf(0xd6U, 0xffU, 0xf8U, 0x7cU),
        ubyteArrayOf(0x74U, 0xfeU, 0x2bU, 0x97U),
        ubyteArrayOf(0xd9U, 0xb5U, 0xacU, 0x84U),
        ubyteArrayOf(0xc4U, 0x74U, 0x64U, 0x5bU),
        ubyteArrayOf(0x46U, 0x5bU, 0x8dU, 0x9bU),
        ubyteArrayOf(0x7bU, 0xefU, 0xe3U, 0x87U),
        ubyteArrayOf(0xe3U, 0x4dU, 0x10U, 0x45U),
        ubyteArrayOf(0x61U, 0x3fU, 0x62U, 0xb3U),
        ubyteArrayOf(0x70U, 0xf3U, 0x67U, 0xfeU),
        ubyteArrayOf(0xe6U, 0xadU, 0xb8U, 0xbdU),
        ubyteArrayOf(0x27U, 0x40U, 0x0cU, 0x63U),
        ubyteArrayOf(0x26U, 0x78U, 0x78U, 0x75U),
        ubyteArrayOf(0x4fU, 0x56U, 0x7bU, 0x5fU),
        ubyteArrayOf(0x3aU, 0xb0U, 0xe6U, 0x69U),
        ubyteArrayOf(0xb0U, 0x64U, 0x40U, 0x00U),
        ubyteArrayOf(0xffU, 0x67U, 0x0fU, 0xb4U),
        ubyteArrayOf(0x50U, 0x9eU, 0x33U, 0x8bU),
        ubyteArrayOf(0x5dU, 0x58U, 0x9fU, 0x1aU),
        ubyteArrayOf(0xfeU, 0xe7U, 0x21U, 0x12U),
        ubyteArrayOf(0x33U, 0x75U, 0x32U, 0x59U),
        ubyteArrayOf(0x6aU, 0x43U, 0x4fU, 0x8cU),
        ubyteArrayOf(0xfeU, 0x28U, 0xb7U, 0x29U),
        ubyteArrayOf(0xe7U, 0x5cU, 0xc6U, 0xecU),
        ubyteArrayOf(0x69U, 0x7eU, 0x8dU, 0x54U),
        ubyteArrayOf(0x63U, 0x68U, 0x8bU, 0x0fU),
        ubyteArrayOf(0x65U, 0x0bU, 0x62U, 0xb4U),
        ubyteArrayOf(0xb6U, 0xbcU, 0x18U, 0x40U),
        ubyteArrayOf(0x5dU, 0x07U, 0x45U, 0x05U),
        ubyteArrayOf(0x24U, 0x42U, 0xfdU, 0x2eU),
        ubyteArrayOf(0x7bU, 0xb7U, 0x86U, 0x3aU),
        ubyteArrayOf(0x77U, 0x05U, 0xd5U, 0x48U),
        ubyteArrayOf(0xd7U, 0x52U, 0x08U, 0xb1U),
        ubyteArrayOf(0xb6U, 0xd4U, 0x99U, 0xc8U),
        ubyteArrayOf(0x08U, 0x92U, 0x20U, 0x2eU),
        ubyteArrayOf(0x69U, 0xe1U, 0x2cU, 0xe3U),
        ubyteArrayOf(0x8dU, 0xb5U, 0x80U, 0xe5U),
        ubyteArrayOf(0x36U, 0x97U, 0x64U, 0xc6U),
        ubyteArrayOf(0x01U, 0x6eU, 0x02U, 0x04U),
        ubyteArrayOf(0x3bU, 0x85U, 0xf3U, 0xd4U),
        ubyteArrayOf(0xfeU, 0xdbU, 0x66U, 0xbeU),
        ubyteArrayOf(0x1eU, 0x69U, 0x2aU, 0x3aU),
        ubyteArrayOf(0xc6U, 0x89U, 0x84U, 0xc0U),
        ubyteArrayOf(0xa5U, 0xc5U, 0xb9U, 0x40U),
        ubyteArrayOf(0x9bU, 0xe9U, 0xe8U, 0x8cU),
        ubyteArrayOf(0x7dU, 0xbcU, 0x81U, 0x40U),
        ubyteArrayOf(0x7cU, 0x07U, 0x8eU, 0xc5U),
        ubyteArrayOf(0xd4U, 0xe7U, 0x6cU, 0x73U),
        ubyteArrayOf(0x42U, 0x8fU, 0xcbU, 0xb9U),
        ubyteArrayOf(0xbdU, 0x83U, 0x99U, 0x7aU),
        ubyteArrayOf(0x59U, 0xeaU, 0x4aU, 0x74U),
    )

    @Test
    final fun givenInvalidKey_thenErrorIsThrown() {
        super.givenInvalidKey_thenErrorIsThrown(byteArrayOf(2))
    }

    @Test
    final override fun givenMac_thenExpectedAlgorithmIsUsed() {
        super.givenMac_thenExpectedAlgorithmIsUsed()
    }

    @Test
    final override fun givenMac_whenHashingInputs_thenDoFinalReturnsExpected() {
        super.givenMac_whenHashingInputs_thenDoFinalReturnsExpected()
    }

    @Test
    final override fun givenMac_whenResetKey_thenDoFinalReturnsExpected() {
        super.givenMac_whenResetKey_thenDoFinalReturnsExpected()
    }

    @Test
    final override fun givenMac_whenUpdatedSmall_thenDoFinalReturnsExpected() {
        super.givenMac_whenUpdatedSmall_thenDoFinalReturnsExpected()
    }

    @Test
    final override fun givenMac_whenUpdatedMedium_thenDoFinalReturnsExpected() {
        super.givenMac_whenUpdatedMedium_thenDoFinalReturnsExpected()
    }

    @Test
    final override fun givenMac_whenCopied_thenIsDifferentInstance() {
        super.givenMac_whenCopied_thenIsDifferentInstance()
    }

    @Test
    final override fun givenMac_whenDoFinal_thenLengthMatchesOutput() {
        super.givenMac_whenDoFinal_thenLengthMatchesOutput()
    }
}
