package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.1iI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C34911iI extends AbstractView$OnClickListenerC49532Ky {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Conversation A01;

    public C34911iI(Conversation conversation, View view) {
        this.A01 = conversation;
        this.A00 = view;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        C26901Le c26901Le;
        Conversation conversation = this.A01;
        C05920Qu c05920Qu = conversation.A1h.A00;
        if (c05920Qu != null && (c26901Le = c05920Qu.A07) != null && c26901Le.A02 != null) {
            String str = c26901Le.A01;
            if (!"video/mp4".equals(str) && !"image/gif".equals(str)) {
                return;
            }
            conversation.A1Z.setProgressBarVisibility(true);
            this.A00.setVisibility(8);
            InterfaceC002901k interfaceC002901k = conversation.A3e;
            C012005w c012005w = conversation.A0m;
            C26901Le c26901Le2 = conversation.A1h.A00.A07;
            interfaceC002901k.ARy(new C35381j3(c012005w, c26901Le2.A02, c26901Le2.A01, new AnonymousClass240() { // from class: X.1iH
                @Override // X.AnonymousClass240
                public void AKE(Exception exc) {
                    C34911iI c34911iI = C34911iI.this;
                    Conversation conversation2 = c34911iI.A01;
                    conversation2.A1Z.setProgressBarVisibility(false);
                    c34911iI.A00.setVisibility(0);
                    if (exc instanceof IOException) {
                        C018508q c018508q = conversation2.A0n;
                        c018508q.A0F(c018508q.A04.A00.getString(R.string.generic_network_error_retry_later), 0);
                    }
                }

                @Override // X.AnonymousClass240
                public void AKO(String str2, File file, byte[] bArr) {
                    C34911iI c34911iI = C34911iI.this;
                    Conversation conversation2 = c34911iI.A01;
                    conversation2.A1Z.setProgressBarVisibility(false);
                    c34911iI.A00.setVisibility(0);
                    if (file == null) {
                        Log.e("conversation/gif-preview/file is null");
                    } else {
                        conversation2.A15(GifHelper.A00(file, conversation2, conversation2.A2f, Collections.singletonList(conversation2.A2a), conversation2.A34), 27);
                    }
                }
            }), new String[0]);
        }
    }
}
