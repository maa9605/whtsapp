package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.reflect.Method;

/* renamed from: X.0zU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21530zU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public C21510zS A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final InterfaceC21520zT A0N;
    public final long[] A0O;

    public C21530zU(InterfaceC21520zT interfaceC21520zT) {
        this.A0N = interfaceC21520zT;
        if (C08M.A00 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    public final long A00() {
        AudioTrack audioTrack = this.A0H;
        if (audioTrack != null) {
            long j = this.A0G;
            if (j != -9223372036854775807L) {
                return Math.min(this.A06, this.A0F + ((((SystemClock.elapsedRealtime() * 1000) - j) * this.A03) / SearchActionVerificationClientService.MS_TO_NS));
            }
            int playState = audioTrack.getPlayState();
            if (playState == 1) {
                return 0L;
            }
            long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
            if (this.A0M) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.A0C = this.A0A;
                }
                playbackHeadPosition += this.A0C;
            }
            if (C08M.A00 <= 28) {
                if (playbackHeadPosition == 0) {
                    long j2 = this.A0A;
                    if (j2 > 0 && playState == 3) {
                        if (this.A07 == -9223372036854775807L) {
                            this.A07 = SystemClock.elapsedRealtime();
                        }
                        return j2;
                    }
                }
                this.A07 = -9223372036854775807L;
            }
            if (this.A0A > playbackHeadPosition) {
                this.A0D++;
            }
            this.A0A = playbackHeadPosition;
            return playbackHeadPosition + (this.A0D << 32);
        }
        throw null;
    }

    public boolean A01(long j) {
        if (j <= A00()) {
            if (!this.A0M) {
                return false;
            }
            AudioTrack audioTrack = this.A0H;
            if (audioTrack != null) {
                if (audioTrack.getPlayState() != 2 || A00() != 0) {
                    return false;
                }
            } else {
                throw null;
            }
        }
        return true;
    }
}
