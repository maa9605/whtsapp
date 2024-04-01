package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.1jT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35641jT extends AbstractView$OnClickListenerC49532Ky {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextStatusComposerActivity A01;

    public C35641jT(TextStatusComposerActivity textStatusComposerActivity, View view) {
        this.A01 = textStatusComposerActivity;
        this.A00 = view;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        C26901Le c26901Le;
        TextStatusComposerActivity textStatusComposerActivity = this.A01;
        C05920Qu c05920Qu = textStatusComposerActivity.A0C;
        if (c05920Qu != null && (c26901Le = c05920Qu.A07) != null && c26901Le.A02 != null) {
            String str = c26901Le.A01;
            if (!"video/mp4".equals(str) && !"image/gif".equals(str)) {
                return;
            }
            textStatusComposerActivity.A0D.setProgressBarVisibility(true);
            this.A00.setVisibility(8);
            InterfaceC002901k interfaceC002901k = textStatusComposerActivity.A0W;
            C012005w c012005w = textStatusComposerActivity.A08;
            C26901Le c26901Le2 = textStatusComposerActivity.A0C.A07;
            interfaceC002901k.ARy(new C35381j3(c012005w, c26901Le2.A02, c26901Le2.A01, new AnonymousClass240() { // from class: X.1jS
                @Override // X.AnonymousClass240
                public void AKE(Exception exc) {
                }

                @Override // X.AnonymousClass240
                public void AKO(String str2, File file, byte[] bArr) {
                    C35641jT c35641jT = C35641jT.this;
                    TextStatusComposerActivity textStatusComposerActivity2 = c35641jT.A01;
                    textStatusComposerActivity2.A0D.setProgressBarVisibility(false);
                    c35641jT.A00.setVisibility(0);
                    if (file == null) {
                        Log.e("textstatus/gif-preview/file is null");
                    } else if (textStatusComposerActivity2 != null) {
                        Uri fromFile = Uri.fromFile(new File(file.getAbsolutePath()));
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(fromFile);
                        String A0t = C002701i.A0t(textStatusComposerActivity2.A0T.getStringText());
                        C42611w2 c42611w2 = new C42611w2(fromFile);
                        c42611w2.A0B(A0t);
                        c42611w2.A0A((byte) 13);
                        C2Gx c2Gx = new C2Gx(c42611w2);
                        String rawString = C04580Kz.A00.getRawString();
                        Bundle A00 = c2Gx.A00();
                        Intent intent = new Intent(textStatusComposerActivity2, MediaComposerActivity.class);
                        intent.putExtra("android.intent.extra.STREAM", arrayList);
                        intent.putExtra("android.intent.extra.TEXT", (String) null);
                        intent.putExtra("jid", rawString);
                        intent.putExtra("jids", (Serializable) null);
                        intent.putExtra("max_items", 0);
                        intent.putExtra("origin", 9);
                        intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
                        intent.putExtra("send", true);
                        intent.putExtra("quoted_message_row_id", 0L);
                        intent.putExtra("quoted_group_jid", (String) null);
                        intent.putExtra("number_from_url", false);
                        intent.putExtra("media_preview_params", A00);
                        intent.putExtra("smb_quick_reply", false);
                        intent.putExtra("start_home", false);
                        intent.putExtra("animate_uri", (Parcelable) null);
                        intent.putExtra("preselected_image_uri", (Parcelable) null);
                        intent.putExtra("scan_for_qr", false);
                        textStatusComposerActivity2.A15(intent, 1);
                    } else {
                        throw null;
                    }
                }
            }), new String[0]);
        }
    }
}
