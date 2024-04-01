package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2WZ */
/* loaded from: classes2.dex */
public class C2WZ extends AbstractC51332Wa {
    public int A00;
    public C41771uU A01;
    public C42451vl A02;
    public C2K4 A03;
    public AbstractView$OnClickListenerC49532Ky A04;
    public AbstractView$OnClickListenerC49532Ky A05;
    public AbstractView$OnClickListenerC49532Ky A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public final View A0A;
    public final View A0B;
    public final ImageView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final TextView A0F;
    public final CircularProgressBar A0G;
    public final InterfaceC43821y3 A0H;
    public final ArrayList A0I;

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return 0;
    }

    @Override // X.C2W2
    public int getMaxAlbumSize() {
        return 102;
    }

    @Override // X.C2W2
    public int getMinAlbumSize() {
        return 4;
    }

    public C2WZ(Context context, AnonymousClass097 anonymousClass097) {
        super(context, anonymousClass097);
        this.A0I = new ArrayList();
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A0H = new InterfaceC43821y3() { // from class: X.38R
            @Override // X.InterfaceC43821y3
            public void AKM() {
            }

            {
                C2WZ.this = this;
            }

            @Override // X.InterfaceC43821y3
            public int ADA() {
                return (C2JE.A01(C2WZ.this.getContext()) * 72) / 200;
            }

            @Override // X.InterfaceC43821y3
            public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                ImageView imageView = (ImageView) view;
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setImageResource(R.drawable.media_image);
                }
            }

            @Override // X.InterfaceC43821y3
            public void AUo(View view) {
                ImageView imageView = (ImageView) view;
                imageView.setImageDrawable(null);
                imageView.setBackgroundColor(-7829368);
            }
        };
        this.A04 = new ViewOnClickCListenerShape8S0100000_I0_0(this, 49);
        this.A06 = new ViewOnClickCListenerShape9S0100000_I0_1(this, 0);
        this.A05 = new ViewOnClickCListenerShape9S0100000_I0_1(this, 1);
        this.A0F = (TextView) findViewById(R.id.more);
        this.A0I.add(new C58822rl(this, findViewById(R.id.thumb_0), 0));
        this.A0I.add(new C58822rl(this, findViewById(R.id.thumb_1), 1));
        this.A0I.add(new C58822rl(this, findViewById(R.id.thumb_2), 2));
        this.A0I.add(new C58822rl(this, findViewById(R.id.thumb_3), 3));
        C000700j.A08(4 == this.A0I.size(), "wrong number of views");
        this.A0A = findViewById(R.id.control_btn);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A0G = circularProgressBar;
        circularProgressBar.A0B = 0;
        this.A0C = (ImageView) findViewById(R.id.cancel_download);
        this.A0B = findViewById(R.id.control_frame);
        boolean z = anonymousClass097.A0n.A02;
        if (!z) {
            this.A0E = (TextView) findViewById(R.id.download_size);
            this.A0D = (TextView) findViewById(R.id.download_item_count);
        } else {
            this.A0E = null;
            this.A0D = null;
        }
        this.A0B.setBackground(new C50502Sa(C02160Ac.A00(getContext(), z ? R.color.bubble_color_outgoing : R.color.bubble_color_incoming)));
        A01(true);
    }

    private void A01(boolean z) {
        TextView textView;
        String A0A;
        int i;
        TextView textView2;
        if (this.A07 == null) {
            return;
        }
        if (z && (textView2 = this.A0E) != null) {
            textView2.setTag(null);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            C58822rl c58822rl = (C58822rl) this.A0I.get(i2);
            AnonymousClass092 anonymousClass092 = (AnonymousClass092) this.A07.get(i2);
            TextView textView3 = c58822rl.A02;
            C2WZ c2wz = c58822rl.A03;
            textView3.setText(AbstractC40621sZ.A00(((AbstractC48202Eh) c2wz).A0J, ((AbstractC48182Ef) c2wz).A0X.A06(anonymousClass092.A0E)));
            c2wz.A0U(textView3, R.drawable.broadcast_status_icon_onmedia, anonymousClass092);
            C42471vn c42471vn = c2wz.A11;
            ImageView imageView = c58822rl.A00;
            InterfaceC43821y3 interfaceC43821y3 = c2wz.A0H;
            StringBuilder A0P = C000200d.A0P("album-");
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            A0P.append(anonymousClass094);
            c42471vn.A0B(anonymousClass092, imageView, interfaceC43821y3, A0P.toString(), false, false);
            if (anonymousClass094.A02 && c58822rl.A01 != null) {
                int i3 = anonymousClass092.A08;
                if (C0D6.A00(i3, 13) >= 0) {
                    i = R.drawable.message_got_read_receipt_from_target_onmedia;
                } else if (C0D6.A00(i3, 5) >= 0) {
                    i = R.drawable.message_got_receipt_from_target_onmedia;
                } else {
                    int A00 = C0D6.A00(i3, 4);
                    i = R.drawable.message_unsent_onmedia;
                    if (A00 == 0) {
                        i = R.drawable.message_got_receipt_from_server_onmedia;
                    }
                }
                c58822rl.A01.setImageResource(i);
            }
            C0AT.A0e(c58822rl.A00, C2JE.A08(anonymousClass092));
            C0AT.A0e(c58822rl.A02, C2JE.A02(anonymousClass092));
            ImageView imageView2 = c58822rl.A01;
            if (imageView2 != null) {
                C0AT.A0e(imageView2, C2JE.A07(anonymousClass092));
            }
        }
        ArrayList arrayList = this.A0I;
        C58822rl c58822rl2 = (C58822rl) arrayList.get(3);
        if (this.A07.size() > arrayList.size()) {
            TextView textView4 = this.A0F;
            textView4.setVisibility(0);
            textView4.setText(getContext().getString(R.string.plus_n, Integer.valueOf((this.A07.size() - arrayList.size()) + 1)));
            c58822rl2.A02.setVisibility(8);
            ImageView imageView3 = c58822rl2.A01;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            int size = this.A07.size() - 4;
            ImageView imageView4 = c58822rl2.A00;
            AnonymousClass088.A1V(imageView4, R.string.action_open_photo_album);
            imageView4.setContentDescription(((AbstractC48202Eh) this).A0J.A0A(R.plurals.number_of_photos, size, Integer.valueOf(size)));
        } else {
            this.A0F.setVisibility(8);
            c58822rl2.A02.setVisibility(0);
            ImageView imageView5 = c58822rl2.A01;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
            }
            ImageView imageView6 = c58822rl2.A00;
            imageView6.setContentDescription(getContext().getString(R.string.action_open_image));
            AnonymousClass088.A1T(imageView6);
        }
        List<AnonymousClass097> list = this.A07;
        if (list != null) {
            for (AnonymousClass097 anonymousClass097 : list) {
                C09H c09h = anonymousClass097.A02;
                if (c09h != null) {
                    if (c09h.A0a) {
                        View view = this.A0B;
                        view.setVisibility(0);
                        CircularProgressBar circularProgressBar = this.A0G;
                        ImageView imageView7 = this.A0C;
                        View view2 = this.A0A;
                        C2JE.A09(true, !z, false, view, circularProgressBar, imageView7, view2);
                        imageView7.setOnClickListener(this.A04);
                        view2.setOnClickListener(this.A04);
                        circularProgressBar.setOnClickListener(this.A04);
                        break;
                    }
                } else {
                    throw null;
                }
            }
        }
        List<AnonymousClass097> list2 = this.A07;
        if (list2 != null) {
            for (AnonymousClass097 anonymousClass0972 : list2) {
                C09H c09h2 = anonymousClass0972.A02;
                if (c09h2 != null) {
                    if (!c09h2.A0P) {
                        View view3 = this.A0B;
                        view3.setVisibility(0);
                        CircularProgressBar circularProgressBar2 = this.A0G;
                        ImageView imageView8 = this.A0C;
                        View view4 = this.A0A;
                        C2JE.A09(false, !z, false, view3, circularProgressBar2, imageView8, view4);
                        int i4 = 0;
                        int i5 = 0;
                        for (AnonymousClass097 anonymousClass0973 : this.A07) {
                            C09H c09h3 = anonymousClass0973.A02;
                            if (c09h3 != null) {
                                if (!c09h3.A0P && !c09h3.A0a) {
                                    if (C0DB.A0m(anonymousClass0973)) {
                                        i5++;
                                    }
                                    i4++;
                                }
                            } else {
                                throw null;
                            }
                        }
                        if (super.getFMessage().A0n.A02 && i4 != i5) {
                            if (view4 instanceof TextView) {
                                TextView textView5 = (TextView) view4;
                                textView5.setText(R.string.retry);
                                textView5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload_dark, 0, 0, 0);
                            }
                            view4.setOnClickListener(this.A06);
                        } else {
                            this.A00 = 0;
                            this.A09 = false;
                            this.A08 = false;
                            long j = 0;
                            ArrayList arrayList2 = new ArrayList();
                            for (AnonymousClass097 anonymousClass0974 : this.A07) {
                                C09H c09h4 = anonymousClass0974.A02;
                                if (c09h4 != null) {
                                    if (!c09h4.A0P && !c09h4.A0a) {
                                        arrayList2.add(anonymousClass0974);
                                        this.A00++;
                                        j += anonymousClass0974.A01;
                                        boolean z2 = this.A08;
                                        byte b = anonymousClass0974.A0m;
                                        this.A08 = z2 | (b == 1);
                                        this.A09 = (b == 3) | this.A09;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                            TextView textView6 = this.A0E;
                            if (textView6 != null && (textView = this.A0D) != null) {
                                textView6.setTag(arrayList2);
                                A0V(textView6, arrayList2, j);
                                if (this.A00 == 0) {
                                    textView.setVisibility(8);
                                } else {
                                    textView.setVisibility(0);
                                    if (!this.A08) {
                                        C002301c c002301c = ((AbstractC48202Eh) this).A0J;
                                        int i6 = this.A00;
                                        A0A = c002301c.A0A(R.plurals.number_of_videos, i6, Integer.valueOf(i6));
                                    } else if (!this.A09) {
                                        C002301c c002301c2 = ((AbstractC48202Eh) this).A0J;
                                        int i7 = this.A00;
                                        A0A = c002301c2.A0A(R.plurals.number_of_photos, i7, Integer.valueOf(i7));
                                    } else {
                                        C002301c c002301c3 = ((AbstractC48202Eh) this).A0J;
                                        int i8 = this.A00;
                                        A0A = c002301c3.A0A(R.plurals.number_of_items, i8, Integer.valueOf(i8));
                                    }
                                    textView.setText(A0A);
                                }
                                view4.setOnClickListener(this.A05);
                            }
                        }
                        A0M();
                    }
                } else {
                    throw null;
                }
            }
        }
        View view5 = this.A0B;
        view5.setVisibility(8);
        C2JE.A09(false, false, false, view5, this.A0G, this.A0C, this.A0A);
        A0M();
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0H() {
        AnonymousClass092 fMessage = super.getFMessage();
        InterfaceC04690Ll rowsContainer = getRowsContainer();
        if (rowsContainer != null) {
            rowsContainer.AV2(fMessage);
            for (AnonymousClass092 anonymousClass092 : this.A07) {
                if (!anonymousClass092.A0n.equals(fMessage.A0n)) {
                    rowsContainer.AVe(anonymousClass092);
                }
            }
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A01(false);
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0L() {
        InterfaceC04690Ll rowsContainer = getRowsContainer();
        if (rowsContainer != null) {
            for (AnonymousClass092 anonymousClass092 : this.A07) {
                rowsContainer.AVe(anonymousClass092);
            }
            ((AbstractC48182Ef) this).A0U.setRowSelected(rowsContainer.AFX(super.getFMessage()));
        }
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        super.A0X(super.getFMessage(), z);
        if (z) {
            A01(false);
        }
    }

    @Override // X.C2W2
    public void A0j(List list, boolean z) {
        boolean z2 = super.getFMessage() != list.get(0);
        if (!z) {
            List list2 = this.A07;
            if (list2 != null && list2.size() == list.size()) {
                for (int i = 0; i < list.size(); i++) {
                    if (this.A07.get(i) == list.get(i)) {
                    }
                }
            }
            z = true;
            break;
        }
        this.A07 = list;
        super.A0X((AnonymousClass092) list.get(0), z);
        if (z2 || z) {
            A01(z2);
        }
    }

    public final Intent A0k() {
        AbstractC005302j abstractC005302j;
        Intent intent = new Intent(getContext(), MediaAlbumActivity.class);
        long[] jArr = new long[this.A07.size()];
        for (int i = 0; i < this.A07.size(); i++) {
            jArr[i] = ((AnonymousClass092) this.A07.get(i)).A0p;
        }
        intent.putExtra("message_ids", jArr);
        AnonymousClass092 fMessage = super.getFMessage();
        AnonymousClass094 anonymousClass094 = fMessage.A0n;
        if (anonymousClass094.A02) {
            abstractC005302j = null;
        } else {
            AbstractC005302j abstractC005302j2 = anonymousClass094.A00;
            if (!C003101m.A0U(abstractC005302j2) || (abstractC005302j = fMessage.A0G) == null) {
                abstractC005302j = abstractC005302j2;
            }
        }
        intent.putExtra("jid", C003101m.A07(abstractC005302j));
        return intent;
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public AnonymousClass097 getFMessage() {
        return (AnonymousClass097) super.getFMessage();
    }

    @Override // X.AbstractC48182Ef
    public int getForwardedTextAnchorId() {
        return R.id.media_container;
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_album_left;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        return (C2JE.A01(getContext()) * 72) / 100;
    }

    @Override // X.C2W2, X.AbstractC48182Ef
    public int getMessageCount() {
        List list = this.A07;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_album_right;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof AnonymousClass097);
        super.setFMessage(anonymousClass092);
    }
}
