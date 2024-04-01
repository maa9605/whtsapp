package com.whatsapp;

import X.AbstractC005302j;
import X.AbstractC28721Ti;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C000700j;
import X.C002301c;
import X.C011605s;
import X.C018708s;
import X.C019208x;
import X.C02180Ae;
import X.C03120Eg;
import X.C05W;
import X.C06C;
import X.C07630Zb;
import X.C09560eJ;
import X.C0HP;
import X.C0HQ;
import X.C0U1;
import X.C0m3;
import X.C13930m5;
import X.C26541Jq;
import X.C26551Jr;
import X.C42381ve;
import X.C42461vm;
import X.C52132a7;
import X.InterfaceC07650Zd;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.AudioPickerActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class AudioPickerActivity extends C0HP implements C0HQ {
    public AudioManager A00;
    public Menu A01;
    public ImageButton A02;
    public ListView A03;
    public RelativeLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public C26551Jr A07;
    public C07630Zb A08;
    public C011605s A09;
    public C05W A0A;
    public C018708s A0B;
    public C42381ve A0C;
    public C03120Eg A0D;
    public C06C A0E;
    public C52132a7 A0F;
    public C42461vm A0G;
    public String A0H;
    public ArrayList A0I;
    public LinkedHashMap A0J;

    public final void A1R() {
        MenuItem findItem;
        C0U1 A0c = A0c();
        C000700j.A04(A0c, "supportActionBar is null");
        Iterator it = this.A0J.values().iterator();
        while (it.hasNext()) {
            String str = ((C26541Jq) it.next()).A03;
            if (str == null || !new File(str).exists()) {
                it.remove();
            }
        }
        boolean z = true;
        if (this.A07.getCursor() == null) {
            this.A03.setVisibility(8);
            this.A05.setVisibility(8);
            this.A04.setVisibility(0);
            this.A06.setVisibility(8);
            this.A0D.A05();
            A0c.A0G("");
        } else {
            this.A04.setVisibility(8);
            if (this.A07.getCursor().getCount() == 0) {
                this.A03.setVisibility(8);
                C02180Ae.A16(this.A02, false, false);
                if (this.A08.A05()) {
                    this.A05.setVisibility(8);
                    this.A06.setVisibility(0);
                    this.A06.setText(getString(R.string.audio_nothing_found, this.A0H));
                } else {
                    this.A05.setVisibility(0);
                    this.A06.setVisibility(8);
                    this.A0J.clear();
                }
                A0c.A0G("");
            } else {
                this.A03.setVisibility(0);
                this.A05.setVisibility(8);
                this.A06.setVisibility(8);
                LinkedHashMap linkedHashMap = this.A0J;
                if (linkedHashMap.isEmpty()) {
                    A0c.A07(R.string.tap_to_select);
                } else {
                    A0c.A0G(((ActivityC02310Ar) this).A01.A0A(R.plurals.n_selected, linkedHashMap.size(), Integer.valueOf(linkedHashMap.size())));
                }
                if (this.A0J.isEmpty()) {
                    C02180Ae.A16(this.A02, false, false);
                } else {
                    C02180Ae.A16(this.A02, true, false);
                }
            }
        }
        Menu menu = this.A01;
        if (menu == null || (findItem = menu.findItem(R.id.menuitem_search)) == null) {
            return;
        }
        findItem.setVisible((this.A07.getCursor() == null || this.A07.getCursor().getCount() <= 0) ? false : false);
    }

    @Override // X.C0HQ
    public C13930m5 AJ7(int i, Bundle bundle) {
        return new AbstractC28721Ti(this, this.A0I, getContentResolver()) { // from class: X.1af
            public static final String[] A04 = {"_id", "artist", "title", "_data", "_display_name", "duration", "_size"};
            public Cursor A00;
            public CancellationSignal A01;
            public final ContentResolver A02;
            public final ArrayList A03;

            {
                this.A02 = r4;
                if (r3 == null) {
                    this.A03 = new ArrayList();
                } else {
                    this.A03 = r3;
                }
            }

            @Override // X.C13930m5
            public void A01() {
                A06();
                Cursor cursor = this.A00;
                if (cursor != null && !cursor.isClosed()) {
                    this.A00.close();
                }
                this.A00 = null;
            }

            @Override // X.C13930m5
            public void A02() {
                Cursor cursor = this.A00;
                if (cursor != null) {
                    A04(cursor);
                }
                boolean z = ((C13930m5) this).A03;
                ((C13930m5) this).A03 = false;
                this.A04 |= z;
                if (z || this.A00 == null) {
                    A00();
                }
            }

            @Override // X.C13930m5
            public void A03() {
                A06();
            }

            @Override // X.AbstractC28721Ti
            public Object A07() {
                synchronized (this) {
                    if (!(((AbstractC28721Ti) this).A02 != null)) {
                        this.A01 = new CancellationSignal();
                    } else {
                        throw new C0S2();
                    }
                }
                try {
                    ArrayList arrayList = this.A03;
                    String[] strArr = new String[arrayList == null ? 0 : arrayList.size() << 1];
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; arrayList != null && i2 < arrayList.size(); i2++) {
                        sb.append(" AND ");
                        sb.append("(");
                        sb.append("title");
                        sb.append(" LIKE ?");
                        sb.append(" OR ");
                        sb.append("artist");
                        sb.append(" LIKE ?");
                        sb.append(")");
                        int i3 = i2 << 1;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("%");
                        sb2.append((String) arrayList.get(i2));
                        sb2.append("%");
                        strArr[i3] = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("%");
                        sb3.append((String) arrayList.get(i2));
                        sb3.append("%");
                        strArr[i3 + 1] = sb3.toString();
                    }
                    ContentResolver contentResolver = this.A02;
                    Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    String[] strArr2 = A04;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("(is_music!=0 OR is_podcast!=0)");
                    sb4.append(sb.toString());
                    Cursor query = contentResolver.query(uri, strArr2, sb4.toString(), strArr, "date_modified DESC", this.A01);
                    if (query != null) {
                        try {
                            query.getCount();
                        } catch (RuntimeException e) {
                            query.close();
                            throw e;
                        }
                    }
                    synchronized (this) {
                        this.A01 = null;
                    }
                    return query;
                } catch (Throwable th) {
                    synchronized (this) {
                        this.A01 = null;
                        throw th;
                    }
                }
            }

            @Override // X.AbstractC28721Ti
            public void A08() {
                synchronized (this) {
                    CancellationSignal cancellationSignal = this.A01;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                }
            }

            @Override // X.AbstractC28721Ti
            public void A0B(Object obj) {
                Cursor cursor = (Cursor) obj;
                if (cursor == null || cursor.isClosed()) {
                    return;
                }
                cursor.close();
            }

            @Override // X.C13930m5
            /* renamed from: A0C */
            public void A04(Cursor cursor) {
                if (this.A05) {
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                Cursor cursor2 = this.A00;
                this.A00 = cursor;
                if (this.A06) {
                    super.A04(cursor);
                }
                if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
                    return;
                }
                cursor2.close();
            }
        };
    }

    @Override // X.C0HQ
    public /* bridge */ /* synthetic */ void ALT(C13930m5 c13930m5, Object obj) {
        this.A07.swapCursor((Cursor) obj);
        A1R();
    }

    @Override // X.C0HQ
    public void ALZ(C13930m5 c13930m5) {
        this.A07.swapCursor(null);
        A1R();
    }

    public void lambda$onCreate$2799$AudioPickerActivity(View view) {
        String A0A;
        String A08 = this.A0B.A08(this.A0E, false);
        LinkedHashMap linkedHashMap = this.A0J;
        int size = linkedHashMap.size();
        if (size == 1) {
            String str = ((C26541Jq) linkedHashMap.values().iterator().next()).A07;
            boolean A0C = this.A0E.A0C();
            int i = R.string.confirm_send_single_audio;
            if (A0C) {
                i = R.string.group_confirm_send_single_audio;
            }
            A0A = getString(i, str, A08);
        } else {
            C002301c c002301c = ((ActivityC02310Ar) this).A01;
            boolean A0C2 = this.A0E.A0C();
            int i2 = R.plurals.confirm_send_audios;
            if (A0C2) {
                i2 = R.plurals.group_confirm_send_audios;
            }
            A0A = c002301c.A0A(i2, size, Integer.valueOf(size), A08);
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A01.A0E = A0A;
        c019208x.A06(R.string.send, new DialogInterface.OnClickListener() { // from class: X.1Fc
            {
                AudioPickerActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AudioPickerActivity audioPickerActivity = AudioPickerActivity.this;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (C26541Jq c26541Jq : audioPickerActivity.A0J.values()) {
                    arrayList.add(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, c26541Jq.A00));
                }
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("result_uris", arrayList);
                audioPickerActivity.setResult(-1, intent);
                audioPickerActivity.finish();
            }
        });
        c019208x.A04(R.string.cancel, null);
        c019208x.A00().show();
    }

    public /* synthetic */ void lambda$onSearchRequested$2800$AudioPickerActivity(View view) {
        this.A04.setVisibility(8);
        if (!this.A0J.isEmpty()) {
            C02180Ae.A16(this.A02, true, true);
        }
        this.A08.A04(true);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (!this.A08.A05()) {
            super.onBackPressed();
            return;
        }
        if (!this.A0J.isEmpty()) {
            C02180Ae.A16(this.A02, true, true);
        }
        this.A08.A04(true);
    }

    @Override // X.C0HP, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_audio_file_list);
        this.A0J = new LinkedHashMap();
        this.A0F = new C52132a7(this.A09, getContentResolver(), new Handler());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0k(toolbar);
        this.A08 = new C07630Zb(this, ((ActivityC02310Ar) this).A01, findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.1hs
            @Override // X.InterfaceC07650Zd
            public boolean ANY(String str) {
                return false;
            }

            {
                AudioPickerActivity.this = this;
            }

            @Override // X.InterfaceC07650Zd
            public boolean ANX(String str) {
                AudioPickerActivity audioPickerActivity = AudioPickerActivity.this;
                audioPickerActivity.A0H = str;
                audioPickerActivity.A0I = C09940f2.A03(str, ((ActivityC02310Ar) audioPickerActivity).A01);
                C0m3.A00(audioPickerActivity).A02(0, null, audioPickerActivity);
                return false;
            }
        });
        C05W c05w = this.A0A;
        AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
        if (A02 != null) {
            this.A0E = c05w.A0A(A02);
            C0U1 A0c = A0c();
            C000700j.A04(A0c, "supportActionBar is null");
            A0c.A0L(true);
            A0c.A0H(getString(R.string.send_to_contact, this.A0B.A08(this.A0E, false)));
            this.A05 = (RelativeLayout) findViewById(R.id.no_audio_layout);
            this.A04 = (RelativeLayout) findViewById(R.id.loading_audio_layout);
            this.A06 = (TextView) findViewById(R.id.empty);
            ListView A1P = A1P();
            this.A03 = A1P;
            A1P.setBackground(null);
            ImageButton imageButton = (ImageButton) findViewById(R.id.fab);
            this.A02 = imageButton;
            C02180Ae.A16(imageButton, false, false);
            this.A02.setOnClickListener(new View.OnClickListener() { // from class: X.1FY
                {
                    AudioPickerActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioPickerActivity.this.lambda$onCreate$2799$AudioPickerActivity(view);
                }
            });
            this.A02.setContentDescription(getString(R.string.send));
            C26551Jr c26551Jr = new C26551Jr(this, this);
            this.A07 = c26551Jr;
            A1Q(c26551Jr);
            this.A00 = ((ActivityC02290Ap) this).A0E.A0A();
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, R.string.search).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        this.A01 = menu;
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        if (findItem != null) {
            findItem.setVisible(this.A03.getCount() > 0);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0F.A00();
        this.A0F = null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02320As, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AudioManager audioManager = this.A00;
        if (audioManager != null) {
            if (i == 24) {
                audioManager.adjustStreamVolume(3, 1, 1);
                return true;
            } else if (i == 25) {
                audioManager.adjustStreamVolume(3, -1, 1);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        C02180Ae.A16(this.A02, false, true);
        this.A08.A01();
        findViewById(R.id.search_back).setOnClickListener(new View.OnClickListener() { // from class: X.1FZ
            {
                AudioPickerActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioPickerActivity.this.lambda$onSearchRequested$2800$AudioPickerActivity(view);
            }
        });
        return false;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        A1R();
        C0m3.A00(this).A02(0, null, this);
        super.onStart();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        C09560eJ A01 = this.A0D.A01();
        if (A01 != null) {
            A01.A05();
            this.A0D.A07(null);
        }
    }
}
