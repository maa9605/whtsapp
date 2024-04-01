package X;

import com.whatsapp.util.Log;
import java.nio.ByteBuffer;

/* renamed from: X.0SQ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0SQ extends C0SO {
    public void A0E(ByteBuffer byteBuffer) {
        while (byteBuffer.position() < byteBuffer.limit()) {
            try {
                C2I2 A06 = C0SO.A06(byteBuffer);
                A0D(2, A06.A00, A06.A02);
            } catch (C2I3 e) {
                Log.e("EventSerialBuffer/putSerializedEvent Error adding serialized event to buffer", e);
                return;
            }
        }
    }
}
