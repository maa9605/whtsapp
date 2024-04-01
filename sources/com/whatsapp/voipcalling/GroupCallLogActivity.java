package com.whatsapp.voipcalling;

import X.AbstractC04890Mh;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.C018708s;
import X.C01B;
import X.C02160Ac;
import X.C02180Ae;
import X.C05W;
import X.C07950aM;
import X.C0D3;
import X.C0D4;
import X.C0GA;
import X.C0HY;
import X.C0L5;
import X.C0U1;
import X.C0Zn;
import X.C2AR;
import X.C2IY;
import X.C2QW;
import X.C2c5;
import X.C84543tv;
import X.InterfaceC52362ab;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GroupCallLogActivity;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class GroupCallLogActivity extends C2QW {
    public C01B A00;
    public C05W A01;
    public AnonymousClass008 A02;
    public C018708s A03;
    public C0Zn A04;
    public C0Zn A05;
    public C0L5 A06;
    public AnonymousClass012 A07;
    public C0HY A08;
    public C2AR A09;
    public C0D3 A0A;
    public C2IY A0B;
    public C84543tv A0C;
    public final C0GA A0D = new C0GA() { // from class: X.3ts
        {
            GroupCallLogActivity.this = this;
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            C84543tv.A00(GroupCallLogActivity.this.A0C, abstractC005302j);
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            C84543tv.A00(GroupCallLogActivity.this.A0C, userJid);
        }
    };
    public final InterfaceC52362ab A0E = new InterfaceC52362ab() { // from class: X.3tt
        @Override // X.InterfaceC52362ab
        public void AUd(ImageView imageView, Bitmap bitmap, boolean z) {
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                imageView.setImageResource(R.drawable.avatar_contact);
            }
        }

        @Override // X.InterfaceC52362ab
        public void AUp(ImageView imageView) {
            imageView.setImageResource(R.drawable.avatar_contact);
        }
    };

    @Override // X.C2QW, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0D3 c0d3;
        AbstractList abstractList;
        int i;
        String string;
        super.onCreate(bundle);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            setTitle(R.string.call_details);
            setContentView(R.layout.group_call_info_activity);
            C07950aM c07950aM = (C07950aM) getIntent().getParcelableExtra("call_log_key");
            if (c07950aM != null) {
                c0d3 = this.A08.A04(new C07950aM(c07950aM.A01, c07950aM.A03, c07950aM.A02, c07950aM.A00));
            } else {
                c0d3 = null;
            }
            this.A0A = c0d3;
            if (c0d3 == null) {
                Log.i("call log missing");
                finish();
                return;
            }
            this.A05 = this.A06.A04(this);
            this.A04 = this.A06.A03(getResources().getDimensionPixelSize(R.dimen.group_call_log_avatar_size), 0.0f);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.participants_list);
            int i2 = 0;
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            C84543tv c84543tv = new C84543tv(this);
            this.A0C = c84543tv;
            recyclerView.setAdapter(c84543tv);
            List A04 = this.A0A.A04();
            UserJid userJid = this.A0A.A09.A01;
            int i3 = 0;
            while (true) {
                abstractList = (AbstractList) A04;
                if (i3 >= abstractList.size() || ((C0D4) abstractList.get(i3)).A02.equals(userJid)) {
                    break;
                }
                i3++;
            }
            if (i3 != 0 && i3 < abstractList.size()) {
                Object obj = abstractList.get(i3);
                abstractList.remove(i3);
                abstractList.add(0, obj);
            }
            Collections.sort(abstractList.subList(1 ^ (this.A0A.A09.A03 ? 1 : 0), abstractList.size()), new C2c5(this.A01, this.A03, this.A00));
            C84543tv c84543tv2 = this.A0C;
            if (c84543tv2 != null) {
                ArrayList arrayList = new ArrayList(A04);
                c84543tv2.A01 = arrayList;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C0D4) it.next()).A00 != 5) {
                            c84543tv2.A00 = i2;
                            break;
                        }
                        i2++;
                    } else {
                        c84543tv2.A00 = Integer.MAX_VALUE;
                        break;
                    }
                }
                ((AbstractC04890Mh) c84543tv2).A01.A00();
                C0D3 c0d32 = this.A0A;
                TextView textView = (TextView) findViewById(R.id.call_type_text);
                ImageView imageView = (ImageView) findViewById(R.id.call_type_icon);
                if (c0d32.A09.A03) {
                    i = R.drawable.ic_call_outgoing;
                    string = getString(R.string.outgoing_call);
                } else if (c0d32.A00 == 5) {
                    i = R.drawable.ic_call_incoming;
                    string = getString(R.string.incoming_call);
                } else {
                    i = R.drawable.ic_call_missed;
                    string = getString(R.string.missed_call);
                }
                textView.setText(string);
                imageView.setImageResource(i);
                C02180Ae.A17(imageView, C02160Ac.A00(this, C02180Ae.A01(i)));
                ((TextView) findViewById(R.id.call_duration)).setText(AnonymousClass029.A0g(((ActivityC02310Ar) this).A01, c0d32.A01));
                ((TextView) findViewById(R.id.call_data)).setText(C02180Ae.A0l(((ActivityC02310Ar) this).A01, c0d32.A02));
                ((TextView) findViewById(R.id.call_date)).setText(AnonymousClass029.A0U(((ActivityC02310Ar) this).A01, this.A07.A06(c0d32.A08)));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = abstractList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(this.A01.A0A(((C0D4) it2.next()).A02));
                }
                ((MultiContactThumbnail) findViewById(R.id.multi_contact_photo)).A00(arrayList2, this.A04, this.A0E);
                this.A02.A01(this.A0D);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.clear_single_log).setIcon(R.drawable.ic_action_delete);
        return true;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A02.A00(this.A0D);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
            Log.i("calllog/delete");
            this.A08.A0A(Collections.singletonList(this.A0A));
            finish();
            return true;
        } else if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else {
            return false;
        }
    }
}
