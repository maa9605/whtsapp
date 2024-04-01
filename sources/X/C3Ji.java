package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.3Ji  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3Ji extends C1TS {
    public final /* synthetic */ StarredMessagesActivity A00;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 85;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Ji(StarredMessagesActivity starredMessagesActivity) {
        super(starredMessagesActivity);
        this.A00 = starredMessagesActivity;
    }

    @Override // X.C1TS
    public View A03(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new AssertionError();
    }

    @Override // X.C1TS
    public void A04(View view, Context context, Cursor cursor) {
        throw new AssertionError();
    }

    @Override // X.C1TS, android.widget.Adapter
    /* renamed from: A05 */
    public AnonymousClass092 getItem(int i) {
        Cursor cursor = this.A02;
        if (cursor != null) {
            cursor.moveToPosition(i);
            return this.A00.A0F.A0H.A02(cursor);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        AnonymousClass092 item = getItem(i);
        if (item != null) {
            return C58832rm.A00(item);
        }
        throw null;
    }

    @Override // X.C1TS, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        AbstractC48182Ef abstractC48182Ef;
        StarredMessagesActivity starredMessagesActivity;
        C06C A0A;
        AnonymousClass092 item = getItem(i);
        if (item != null) {
            if (view == null) {
                abstractC48182Ef = ((AbstractActivityC04650Lh) this.A00).A0D.A02(viewGroup.getContext(), item);
            } else {
                abstractC48182Ef = (AbstractC48182Ef) view;
                abstractC48182Ef.A0X(item, true);
            }
            ImageView imageView = (ImageView) abstractC48182Ef.findViewById(R.id.profile_picture);
            C0AT.A0V(imageView, 2);
            if (item.A0n.A02) {
                starredMessagesActivity = this.A00;
                C02L c02l = starredMessagesActivity.A02;
                c02l.A05();
                A0A = c02l.A01;
                if (A0A == null) {
                    throw null;
                }
            } else {
                starredMessagesActivity = this.A00;
                C05W c05w = ((AbstractActivityC04650Lh) starredMessagesActivity).A06;
                UserJid A0B = item.A0B();
                if (A0B != null) {
                    A0A = c05w.A0A(A0B);
                } else {
                    throw null;
                }
            }
            starredMessagesActivity.A0A.A02(A0A, imageView);
            abstractC48182Ef.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, item, 9));
            if ((abstractC48182Ef instanceof C2X7) && ((C04040Ie) abstractC48182Ef.getFMessage()).A00) {
                C2X7 c2x7 = (C2X7) abstractC48182Ef;
                c2x7.A02 = true;
                StickerView stickerView = c2x7.A06.A0M;
                if (stickerView != null) {
                    stickerView.A02 = true;
                    stickerView.A00();
                }
            }
            return abstractC48182Ef;
        }
        throw null;
    }
}
