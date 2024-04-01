package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.util.ViewOnClickCListenerShape3S0300000_I1;
import java.util.List;

/* renamed from: X.2pE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C57392pE extends ArrayAdapter {
    public final /* synthetic */ ListChatInfo A00;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57392pE(ListChatInfo listChatInfo, Context context, List list) {
        super(context, (int) R.layout.participant_list_row, list);
        this.A00 = listChatInfo;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.A00.A0n.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        C06C c06c = (C06C) getItem(i);
        if (c06c != null) {
            return c06c.A0A() ? 1 : 0;
        }
        throw null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C57402pF c57402pF;
        String str = null;
        if (view == null) {
            C06C c06c = (C06C) getItem(i);
            if (c06c != null) {
                boolean A0A = c06c.A0A();
                int i2 = R.layout.group_chat_info_row_unknown_contact;
                if (!A0A) {
                    i2 = R.layout.group_chat_info_row;
                }
                ListChatInfo listChatInfo = this.A00;
                view = listChatInfo.getLayoutInflater().inflate(i2, viewGroup, false);
                c57402pF = new C57402pF(null);
                c57402pF.A02 = new C06030Rg(view, (int) R.id.name, listChatInfo.A0E, listChatInfo.A0f);
                c57402pF.A01 = (TextEmojiLabel) view.findViewById(R.id.status);
                c57402pF.A00 = (ImageView) view.findViewById(R.id.avatar);
                view.setTag(c57402pF);
            } else {
                throw null;
            }
        } else {
            c57402pF = (C57402pF) view.getTag();
        }
        Object item = getItem(i);
        if (item != null) {
            C06C c06c2 = (C06C) item;
            c57402pF.A03 = c06c2;
            c57402pF.A02.A03(c06c2, null);
            ImageView imageView = c57402pF.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getApplicationContext().getResources().getString(R.string.transition_avatar));
            sb.append(C003101m.A07(c06c2.A02()));
            C0AT.A0e(imageView, sb.toString());
            this.A00.A0F.A02(c06c2, c57402pF.A00);
            c57402pF.A00.setOnClickListener(new ViewOnClickCListenerShape3S0300000_I1(this, c57402pF, c06c2, 1));
            if (c06c2.A0A()) {
                c57402pF.A01.setVisibility(0);
                TextEmojiLabel textEmojiLabel = c57402pF.A01;
                String str2 = c06c2.A0O;
                if (str2 != null) {
                    StringBuilder A0P = C000200d.A0P("~");
                    A0P.append(str2);
                    str = A0P.toString();
                }
                textEmojiLabel.A03(str);
                return view;
            } else if (c06c2.A0L != null) {
                c57402pF.A01.setVisibility(0);
                c57402pF.A01.A03(c06c2.A0L);
                return view;
            } else {
                c57402pF.A01.setVisibility(8);
                return view;
            }
        }
        throw null;
    }
}
