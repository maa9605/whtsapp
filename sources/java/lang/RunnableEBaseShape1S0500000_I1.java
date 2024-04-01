package java.lang;

import X.AnonymousClass078;
import X.AnonymousClass092;
import X.AnonymousClass387;
import X.C05920Qu;
import X.C0CD;
import X.C0CZ;
import X.C38D;
import X.C58692rY;
import X.C58762rf;
import X.C58772rg;
import X.InterfaceC58672rW;
import android.content.ContentValues;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.WebPagePreviewView;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.URISyntaxException;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S0500000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 1;

    public RunnableEBaseShape1S0500000_I1(C58692rY c58692rY, Spannable spannable, TextView textView, Object obj, InterfaceC58672rW interfaceC58672rW) {
        this.A03 = c58692rY;
        this.A02 = spannable;
        this.A04 = textView;
        this.A01 = obj;
        this.A00 = interfaceC58672rW;
    }

    public RunnableEBaseShape1S0500000_I1(C58772rg c58772rg, WebPagePreviewView webPagePreviewView, C38D c38d, AnonymousClass092 anonymousClass092, AnonymousClass387 anonymousClass387) {
        this.A00 = c58772rg;
        this.A01 = webPagePreviewView;
        this.A02 = c38d;
        this.A03 = anonymousClass092;
        this.A04 = anonymousClass387;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A05) {
            case 0:
                C58772rg c58772rg = (C58772rg) this.A00;
                View view = (View) this.A01;
                C05920Qu c05920Qu = (C05920Qu) this.A02;
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A03;
                Object obj = this.A04;
                C58762rf c58762rf = (C58762rf) view.getTag();
                try {
                    C38D c38d = c58762rf.A00;
                    c38d.A0B(c38d.A0B);
                    AnonymousClass092 anonymousClass0922 = c58762rf.A01;
                    C0CZ c0cz = anonymousClass0922.A0H;
                    if (c0cz != null) {
                        c0cz.A00 = c05920Qu.A0F;
                    }
                    if (anonymousClass0922.A0n.A01.equals(anonymousClass092.A0n.A01)) {
                        c58772rg.A00.A02.post(new RunnableEBaseShape2S0300000_I1(obj, view, c05920Qu, 2));
                    }
                    AnonymousClass078 anonymousClass078 = c58772rg.A01;
                    long j = anonymousClass0922.A0p;
                    byte[] bArr = c05920Qu.A0F;
                    C0CD A04 = anonymousClass078.A00.A04();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("full_thumbnail", bArr);
                    if (A04.A02.A00("message_external_ad_content", contentValues, "message_row_id=?", new String[]{String.valueOf(j)}) == 0) {
                        Log.e("ExternalAdContentInfoStore/updateFullThumbnail/full thumbnail wasn't updated");
                    }
                    A04.close();
                } catch (IOException | URISyntaxException e) {
                    Log.w("ConversationPageInfoLoader/load/failed to load thumb", e);
                }
                c58772rg.A04.remove(c58762rf.A01.A0n.A01);
                return;
            case 1:
                if (((C58692rY) this.A03).A04 || !this.A01.equals(((View) this.A04).getTag())) {
                    return;
                }
                ((InterfaceC58672rW) this.A00).ARW((Spannable) this.A02);
                return;
            default:
                return;
        }
    }
}
