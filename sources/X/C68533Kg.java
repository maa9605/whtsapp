package X;

import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.3Kg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68533Kg extends C3DS {
    public final C018508q A00;
    public final WeakReference A01;

    public C68533Kg(C018508q c018508q, C0EG c0eg, GroupChatInfo groupChatInfo, C011005l c011005l, UserJid userJid) {
        super(c0eg, c011005l, userJid);
        this.A00 = c018508q;
        this.A01 = new WeakReference(groupChatInfo);
    }
}
