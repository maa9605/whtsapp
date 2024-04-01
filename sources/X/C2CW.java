package X;

import android.os.ConditionVariable;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.2CW */
/* loaded from: classes2.dex */
public class C2CW implements C2CU {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C42171vH A01;

    public C2CW(C42171vH c42171vH, ConditionVariable conditionVariable) {
        this.A01 = c42171vH;
        this.A00 = conditionVariable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x001c, code lost:
        if (r7.A0D.A03() != 0) goto L8;
     */
    @Override // X.C2CU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AH0(int r15) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2CW.AH0(int):void");
    }

    @Override // X.C2CU
    public void AHx() {
        C42171vH c42171vH = this.A01;
        c42171vH.A00 = false;
        C018508q c018508q = c42171vH.A02;
        c018508q.A06(R.string.msg_store_backup_db_title, R.string.settings_backup_db_now_message);
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 2);
        long timeInMillis = calendar.getTimeInMillis();
        C002301c c002301c = c42171vH.A0E;
        c018508q.A0H(AbstractC40621sZ.A01(c002301c, c42171vH.A0C.A00.getString(R.string.msg_store_backup_db_message, AbstractC40621sZ.A00(c002301c, timeInMillis)), timeInMillis));
    }

    @Override // X.C2CU
    public void ANR(int i) {
        String format = String.format(Locale.ENGLISH, "app/backup/progress/%d%%", Integer.valueOf(i));
        if (i % 10 == 0) {
            Log.i(format);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 2);
        long timeInMillis = calendar.getTimeInMillis();
        C42171vH c42171vH = this.A01;
        C018508q c018508q = c42171vH.A02;
        C002301c c002301c = c42171vH.A0E;
        c018508q.A0H(AbstractC40621sZ.A01(c002301c, c42171vH.A0C.A00.getString(R.string.msg_store_backup_db_message_with_percentage_placeholder, c002301c.A0H().format(i / 100.0d), AbstractC40621sZ.A00(c002301c, timeInMillis)), timeInMillis));
    }
}
