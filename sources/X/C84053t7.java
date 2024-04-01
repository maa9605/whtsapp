package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.3t7 */
/* loaded from: classes2.dex */
public class C84053t7 extends AbstractC48662Ge {
    public JSONObject A05;
    public final Context A08;
    public final WebView A09;
    public final RelativeLayout A0A;
    public final C018508q A0B;
    public final C2Zb A0C;
    public final String A0D;
    public int A01 = 0;
    public long A04 = -9223372036854775807L;
    public int A03 = -1;
    public boolean A06 = false;
    public boolean A07 = false;
    public int A02 = 1;
    public int A00 = 0;

    @Override // X.AbstractC48662Ge
    public Bitmap A04() {
        return null;
    }

    @Override // X.AbstractC48662Ge
    public void A0B(boolean z) {
    }

    @Override // X.AbstractC48662Ge
    public boolean A0D() {
        return false;
    }

    @Override // X.AbstractC48662Ge
    public boolean A0E() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C84053t7(android.content.Context r12, X.C018508q r13, java.lang.String r14, final boolean r15, X.C2Zb r16, final android.graphics.Bitmap r17) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84053t7.<init>(android.content.Context, X.08q, java.lang.String, boolean, X.2Zb, android.graphics.Bitmap):void");
    }

    @Override // X.AbstractC48662Ge
    public int A02() {
        return this.A01;
    }

    @Override // X.AbstractC48662Ge
    public int A03() {
        long j = this.A04;
        if (j == -9223372036854775807L) {
            return 0;
        }
        return (int) j;
    }

    @Override // X.AbstractC48662Ge
    public View A05() {
        RelativeLayout relativeLayout = this.A0A;
        return relativeLayout == null ? this.A09 : relativeLayout;
    }

    @Override // X.AbstractC48662Ge
    public void A06() {
        if (this.A07) {
            Log.i("InlineYoutubeVideoPlayer/pause()");
            this.A09.loadUrl("javascript:(function() { player.pauseVideo(); })()");
            this.A02 = 2;
            this.A00 = 2;
            C2Zb c2Zb = this.A0C;
            c2Zb.A02();
            c2Zb.A06 = true;
        }
    }

    @Override // X.AbstractC48662Ge
    public void A08() {
        if (!this.A06) {
            Log.i("InlineYoutubeVideoPlayer/startLoadingUrl");
            this.A06 = true;
            WebView webView = this.A09;
            Locale locale = Locale.US;
            String str = this.A0D;
            C000700j.A03(str);
            Object[] objArr = new Object[1];
            JSONObject jSONObject = this.A05;
            if (jSONObject != null) {
                objArr[0] = jSONObject.toString();
                webView.loadDataWithBaseURL("https://whatsapp.com", String.format(locale, str, objArr), "text/html", "UTF-8", "https://youtube.com");
                return;
            }
            throw null;
        }
        this.A09.loadUrl("javascript:(function() { player.playVideo(); })()");
        this.A02 = 1;
        this.A00 = 1;
        C2Zb c2Zb = this.A0C;
        c2Zb.A03();
        c2Zb.A06 = true;
    }

    @Override // X.AbstractC48662Ge
    public void A09() {
        Log.i("InlineYoutubeVideoPlayer/stop");
        RelativeLayout relativeLayout = this.A0A;
        if (relativeLayout != null && relativeLayout.getChildCount() > 0) {
            relativeLayout.removeAllViews();
        }
        WebView webView = this.A09;
        webView.removeJavascriptInterface("YoutubeJsInterface");
        webView.stopLoading();
        webView.destroy();
        this.A01 = 0;
        this.A03 = -1;
        this.A00 = 0;
        this.A02 = 1;
        this.A07 = false;
        this.A06 = false;
        this.A04 = -9223372036854775807L;
    }

    @Override // X.AbstractC48662Ge
    public void A0A(int i) {
        if (this.A07) {
            StringBuilder A0P = C000200d.A0P("InlineYoutubeVideoPlayer seekTo: ");
            int i2 = i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            C000200d.A1F(A0P, i2);
            WebView webView = this.A09;
            StringBuilder sb = new StringBuilder("javascript:(function() { player.seekTo(");
            sb.append(i2);
            sb.append(", true); })()");
            webView.loadUrl(sb.toString());
            this.A01 = i;
        }
    }

    @Override // X.AbstractC48662Ge
    public boolean A0C() {
        return this.A02 == 1;
    }

    public final void A0F(String str, boolean z) {
        StringBuilder sb = new StringBuilder("InlineYoutubeVideoPlayer: ");
        sb.append(str);
        String obj = sb.toString();
        InterfaceC73123b8 interfaceC73123b8 = super.A02;
        if (interfaceC73123b8 != null) {
            interfaceC73123b8.AJy(obj, z);
        }
    }
}
