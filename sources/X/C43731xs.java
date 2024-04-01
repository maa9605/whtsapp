package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.whatsapp.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: X.1xs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43731xs implements InterfaceC43741xt {
    public static final int[] A09 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
    public int A00;
    public InterfaceC63092z4 A01;
    public ByteBuffer[] A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final File A06;
    public final File A07;
    public volatile boolean A08;

    @Override // X.InterfaceC43741xt
    public boolean AEV() {
        return true;
    }

    public C43731xs(C63072z1 c63072z1) {
        this.A06 = c63072z1.A03;
        this.A04 = c63072z1.A01;
        this.A05 = c63072z1.A02;
        this.A07 = c63072z1.A04;
        this.A03 = c63072z1.A00;
    }

    public static boolean A00(File file) {
        if (file != null && file.exists()) {
            try {
                C40831sw c40831sw = new C40831sw();
                c40831sw.A00(file);
                boolean z = c40831sw.extractMetadata(16) != null;
                c40831sw.close();
                return z;
            } catch (Exception e) {
                Log.e("audiotranscoder/cantranscode", e);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x03d3, code lost:
        if (r52.A01.ANQ(r7) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0241, code lost:
        if (r5.getInteger("bit-width") != 24) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0490 A[Catch: all -> 0x04e3, TryCatch #0 {all -> 0x04e3, blocks: (B:48:0x01b5, B:49:0x01cb, B:161:0x0488, B:163:0x0490, B:164:0x0493, B:165:0x0499, B:150:0x044c, B:152:0x0454, B:153:0x0457, B:166:0x049a, B:167:0x04b4, B:169:0x04b6, B:170:0x04d0, B:173:0x04d3, B:174:0x04e2, B:42:0x015f), top: B:194:0x00cf, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01() {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43731xs.A01():void");
    }

    public final void A02(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, byte[] bArr, WritableByteChannel writableByteChannel) {
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        while (dequeueOutputBuffer != -1) {
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = this.A02[dequeueOutputBuffer];
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                if ((bufferInfo.flags & 2) == 0) {
                    this.A00++;
                    int i = (bufferInfo.size - bufferInfo.offset) + 7;
                    bArr[3] = (byte) (((i >> 11) & 3) | (bArr[3] & 252));
                    bArr[4] = (byte) ((i >> 3) & 255);
                    bArr[5] = (byte) (((i & 7) << 5) | 31);
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                    writableByteChannel.write(byteBuffer);
                }
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else if (dequeueOutputBuffer == -3) {
                this.A02 = mediaCodec.getOutputBuffers();
                Log.i("audiotranscoder/encoder output buffers have changed");
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                StringBuilder sb = new StringBuilder("audiotranscoder/encoder output format has changed to ");
                sb.append(outputFormat);
                Log.i(sb.toString());
            }
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        }
    }

    @Override // X.InterfaceC43741xt
    public void cancel() {
        this.A08 = true;
    }
}
