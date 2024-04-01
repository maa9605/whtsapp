package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;

/* renamed from: X.44c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C886944c implements C44O {
    public MediaRecorder A00;
    public final C42B A01;
    public final boolean A02 = true;

    public C886944c(C42B c42b) {
        this.A01 = c42b;
    }

    public final void A00(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, int i, boolean z) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        C42B c42b = this.A01;
        c42b.AOb(mediaRecorder);
        if (this.A02) {
            this.A00.setAudioSource(5);
            this.A00.setProfile(camcorderProfile);
        } else {
            this.A00.setOutputFormat(camcorderProfile.fileFormat);
            this.A00.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A00.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A00.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A00.setVideoEncoder(camcorderProfile.videoCodec);
        }
        MediaRecorder mediaRecorder2 = this.A00;
        if (!z) {
            i = 0;
        }
        mediaRecorder2.setOrientationHint(i);
        this.A00.setOutputFile(fileDescriptor);
        this.A00.prepare();
        c42b.AOt(this.A00);
        this.A00.start();
    }

    @Override // X.C44O
    public C44N AV5(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, C44B c44b, int i, boolean z, C44K c44k, boolean z2) {
        A00(camcorderProfile, fileDescriptor, i, z);
        C44N c44n = new C44N(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i, c44b);
        long A0O = C07K.A0O(c44k);
        long j = c44n.A01;
        if (j != -1) {
            A0O = j;
        }
        c44n.A01 = A0O;
        return c44n;
    }

    @Override // X.C44O
    public C44N AV6(CamcorderProfile camcorderProfile, String str, C44B c44b, int i, boolean z, C44K c44k, boolean z2) {
        A00(camcorderProfile, new RandomAccessFile(str, "rws").getFD(), i, z);
        C44N c44n = new C44N(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, str, i, c44b, camcorderProfile.audioCodec, camcorderProfile.videoCodec);
        long A0O = C07K.A0O(c44k);
        long j = c44n.A01;
        if (j != -1) {
            A0O = j;
        }
        c44n.A01 = A0O;
        return c44n;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C44O
    public void AVE() {
        try {
            try {
                MediaRecorder mediaRecorder = this.A00;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                MediaRecorder mediaRecorder2 = this.A00;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.reset();
                    this.A00.release();
                    this.A00 = null;
                }
            } catch (RuntimeException e) {
                Log.e("SimpleVideoCapture", "stopVideoRecording", e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A00;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A00.release();
                this.A00 = null;
            }
            throw th;
        }
    }
}
