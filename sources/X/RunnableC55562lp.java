package X;

import android.content.Intent;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2lp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC55562lp extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RestoreFromBackupActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ RunnableC55562lp(RestoreFromBackupActivity restoreFromBackupActivity, String str, int i) {
        this.A01 = restoreFromBackupActivity;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A01;
        String str = this.A02;
        int i = this.A00;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-activity/auth-request asking GoogleAuthUtil for token for ");
            sb.append(C40061rW.A0B(str));
            Log.i(sb.toString());
            restoreFromBackupActivity.A0c = C30331aK.A04(restoreFromBackupActivity, str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gdrive-activity/auth-request for account ");
            sb2.append(C40061rW.A0B(str));
            sb2.append(", token has been received.");
            Log.i(sb2.toString());
            Intent intent = new Intent();
            intent.putExtra("authtoken", restoreFromBackupActivity.A0c);
            intent.putExtra("authAccount", str);
            restoreFromBackupActivity.onActivityResult(i, -1, intent);
            restoreFromBackupActivity.A0j.open();
        } catch (C39441q8 e) {
            C018508q c018508q = ((ActivityC02290Ap) restoreFromBackupActivity).A0A;
            c018508q.A02.post(new RunnableEBaseShape0S0100000_I0_0(restoreFromBackupActivity, 10));
            Log.e("gdrive-activity/gps-unavailable", e);
            restoreFromBackupActivity.A0c = null;
        } catch (C0TO e2) {
            restoreFromBackupActivity.A0j.close();
            restoreFromBackupActivity.A0c = null;
            restoreFromBackupActivity.A1g(25, null);
            C018508q c018508q2 = ((ActivityC02290Ap) restoreFromBackupActivity).A0A;
            c018508q2.A02.post(new RunnableEBaseShape0S0201000_I0(restoreFromBackupActivity, i, e2, 0));
        } catch (C0TP e3) {
            e = e3;
            Log.e("gdrive-activity/auth-request", e);
            restoreFromBackupActivity.A0c = null;
            restoreFromBackupActivity.A0j.open();
            C018508q c018508q3 = ((ActivityC02290Ap) restoreFromBackupActivity).A0A;
            c018508q3.A02.post(new RunnableEBaseShape0S1100000_I0(restoreFromBackupActivity, str, 4));
        } catch (IOException e4) {
            Log.e("gdrive-activity/auth-request", e4);
            restoreFromBackupActivity.A0c = null;
            restoreFromBackupActivity.A0j.open();
            C018508q c018508q4 = ((ActivityC02290Ap) restoreFromBackupActivity).A0A;
            c018508q4.A02.post(new RunnableEBaseShape0S0100000_I0_0(restoreFromBackupActivity, 13));
        } catch (SecurityException e5) {
            e = e5;
            Log.e("gdrive-activity/auth-request", e);
            restoreFromBackupActivity.A0c = null;
            restoreFromBackupActivity.A0j.open();
            C018508q c018508q32 = ((ActivityC02290Ap) restoreFromBackupActivity).A0A;
            c018508q32.A02.post(new RunnableEBaseShape0S1100000_I0(restoreFromBackupActivity, str, 4));
        }
    }
}
