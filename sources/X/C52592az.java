package X;

import com.google.android.search.verification.client.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.2az */
/* loaded from: classes2.dex */
public class C52592az extends GregorianCalendar {
    public int count;
    public final int id;
    public final C002301c whatsAppLocale;

    public C52592az(C002301c c002301c, int i, Calendar calendar) {
        this.id = i;
        setTime(calendar.getTime());
        this.whatsAppLocale = c002301c;
    }

    public C52592az(C002301c c002301c, C52592az c52592az) {
        this.id = c52592az.id;
        this.count = c52592az.count;
        setTime(c52592az.getTime());
        this.whatsAppLocale = c002301c;
    }

    @Override // java.util.Calendar
    public String toString() {
        int i = this.id;
        if (i != 1) {
            if (i == 2) {
                C002301c c002301c = this.whatsAppLocale;
                return C002501g.A0G(c002301c.A0I(), c002301c.A05(232));
            } else if (i == 3) {
                C002301c c002301c2 = this.whatsAppLocale;
                return C002501g.A0G(c002301c2.A0I(), c002301c2.A05(231));
            } else if (i != 4) {
                C002301c c002301c3 = this.whatsAppLocale;
                return new SimpleDateFormat(c002301c3.A05(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH), c002301c3.A0I()).format(new Date(getTimeInMillis()));
            } else {
                C002301c c002301c4 = this.whatsAppLocale;
                long timeInMillis = getTimeInMillis();
                Calendar calendar = Calendar.getInstance(c002301c4.A0I());
                calendar.setTimeInMillis(timeInMillis);
                return AbstractC09110cf.A00(c002301c4)[calendar.get(2)];
            }
        }
        return this.whatsAppLocale.A06(R.string.recent);
    }
}
