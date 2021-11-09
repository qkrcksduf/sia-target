import com.sia.odc.common.PointOuterClass
import com.sia.odc.inference.InferenceLabelProto
import com.sia.odc.inference.InferenceResultProto
import com.sia.odc.label.MatchingTypeProto
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TestSerialization : FunSpec({
    test("test") {
        val label = InferenceLabelProto.InferenceLabel.newBuilder()
            .setClassId(4)
            .setClass2Id(4)
            .setClass3Id(4)
            .setCenter(PointOuterClass.Point.newBuilder().setX(1.0).setY(2.0).build())
            .setLocation(PointOuterClass.Point.newBuilder().setX(3.0).setY(4.0).build())
            .setWidth(1.0)
            .setHeight(2.0)
            .setConfidence(0.1)
            .setConfidenceT1(0.2)
            .setConfidenceT2(0.3)
            .setConfidenceT3(0.4)
            .setAngle(1.0)
            .setMatching(MatchingTypeProto.MatchingType.DET)
            .setSceneId("test")
            .build()

        val expected = InferenceResultProto.InferenceResult.newBuilder()
            .addLabels(label)
            .build()
        val bytes = expected.toByteArray()
        val actual = InferenceResultProto.InferenceResult.parseFrom(bytes)
        actual.shouldBe(expected)
    }
})
