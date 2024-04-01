package com.whatsapp;

import X.AbstractC005302j;
import X.AbstractC28721Ti;
import X.ActivityC02290Ap;
import X.AnonymousClass088;
import X.C000700j;
import X.C002301c;
import X.C002701i;
import X.C012005w;
import X.C018708s;
import X.C019208x;
import X.C01B;
import X.C02160Ac;
import X.C02E;
import X.C05W;
import X.C06C;
import X.C0HQ;
import X.C0O8;
import X.C0U0;
import X.C0U1;
import X.C0W0;
import X.C0m3;
import X.C13930m5;
import X.C1KS;
import X.C1KT;
import X.C40081rY;
import X.C42041uv;
import X.C460324r;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.DocumentPickerActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileFilter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DocumentPickerActivity extends C0W0 implements C0HQ {
    public MenuItem A01;
    public C0U0 A02;
    public C1KS A03;
    public C012005w A04;
    public C01B A05;
    public C002301c A06;
    public AbstractC005302j A07;
    public String A08;
    public ArrayList A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public final List A0E = new ArrayList();
    public int A00 = 0;
    public final C0O8 A0D = new C0O8() { // from class: X.1im
        public MenuItem A00;

        {
            DocumentPickerActivity.this = this;
        }

        @Override // X.C0O8
        public boolean AGv(C0U0 c0u0, MenuItem menuItem) {
            if (menuItem.getItemId() == R.id.menuitem_share) {
                DocumentPickerActivity documentPickerActivity = DocumentPickerActivity.this;
                List list = documentPickerActivity.A0E;
                if (list.isEmpty()) {
                    return false;
                }
                documentPickerActivity.A1T(list);
                return false;
            }
            return false;
        }

        @Override // X.C0O8
        public boolean AJ5(C0U0 c0u0, Menu menu) {
            MenuItem add = menu.add(0, R.id.menuitem_share, 0, R.string.send);
            this.A00 = add;
            add.setShowAsAction(2);
            return true;
        }

        @Override // X.C0O8
        public void AJK(C0U0 c0u0) {
            DocumentPickerActivity documentPickerActivity = DocumentPickerActivity.this;
            documentPickerActivity.A0E.clear();
            documentPickerActivity.A02 = null;
            documentPickerActivity.A03.notifyDataSetChanged();
        }

        @Override // X.C0O8
        public boolean ANE(C0U0 c0u0, Menu menu) {
            DocumentPickerActivity documentPickerActivity = DocumentPickerActivity.this;
            List list = documentPickerActivity.A0E;
            if (list.isEmpty()) {
                c0u0.A08(R.string.select_multiple_title);
            } else {
                c0u0.A0B(documentPickerActivity.getResources().getQuantityString(R.plurals.n_selected, list.size(), Integer.valueOf(list.size())));
            }
            this.A00.setVisible(!list.isEmpty());
            return true;
        }
    };

    @Override // X.C0HQ
    public void ALZ(C13930m5 c13930m5) {
    }

    public static void A00(DocumentPickerActivity documentPickerActivity) {
        if (documentPickerActivity.A03.getCount() == 0) {
            if (documentPickerActivity.A0A == null) {
                documentPickerActivity.findViewById(R.id.search_no_matches).setVisibility(8);
                documentPickerActivity.findViewById(R.id.progress).setVisibility(0);
            } else {
                ArrayList arrayList = documentPickerActivity.A09;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TextView textView = (TextView) documentPickerActivity.findViewById(R.id.search_no_matches);
                    textView.setVisibility(0);
                    textView.setText(documentPickerActivity.getString(R.string.search_no_results, documentPickerActivity.A08));
                    documentPickerActivity.findViewById(R.id.progress).setVisibility(8);
                } else {
                    TextView textView2 = (TextView) documentPickerActivity.findViewById(R.id.search_no_matches);
                    textView2.setVisibility(0);
                    textView2.setText(R.string.no_documents_found);
                    documentPickerActivity.findViewById(R.id.progress).setVisibility(8);
                }
            }
            documentPickerActivity.findViewById(16908292).setVisibility(0);
            return;
        }
        documentPickerActivity.findViewById(16908292).setVisibility(8);
    }

    public final void A1R() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        A15(intent, 1);
    }

    public final void A1S(C1KT c1kt) {
        List list = this.A0E;
        if (list.contains(c1kt)) {
            list.remove(c1kt);
            if (list.isEmpty()) {
                this.A02.A05();
            } else {
                this.A02.A06();
            }
        } else if (list.size() >= 30) {
            ((ActivityC02290Ap) this).A0A.A0E(C42041uv.A04(this, 30), 0);
        } else {
            list.add(c1kt);
            this.A02.A06();
        }
        if (!list.isEmpty()) {
            AnonymousClass088.A1C(this, ((ActivityC02290Ap) this).A0E, getResources().getQuantityString(R.plurals.n_items_selected, list.size(), Integer.valueOf(list.size())));
        }
        this.A03.notifyDataSetChanged();
    }

    public final void A1T(Collection collection) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.fromFile(((C1KT) it.next()).A02));
        }
        AbstractC005302j abstractC005302j = this.A07;
        SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", abstractC005302j.getRawString());
        bundle.putParcelableArrayList("uri_list", arrayList);
        bundle.putBoolean("finish_on_cancel", false);
        sendDocumentsConfirmationDialogFragment.A0P(bundle);
        sendDocumentsConfirmationDialogFragment.A14(A0N(), null);
    }

    @Override // X.C0HQ
    public C13930m5 AJ7(int i, Bundle bundle) {
        return new AbstractC28721Ti(this, this.A04, this.A05, this.A06) { // from class: X.1X8
            public List A00;
            public final C01B A01;
            public final C002301c A02;
            public final File[] A03;

            {
                this.A01 = r7;
                this.A02 = r8;
                File file = r6.A04().A02;
                AbstractC012105x.A03(file, false);
                this.A03 = new File[]{new File(Environment.getExternalStorageDirectory(), "Download"), Environment.getExternalStorageDirectory(), file, new File(Environment.getExternalStorageDirectory(), "Documents")};
            }

            @Override // X.C13930m5
            public void A01() {
                A06();
                this.A00 = null;
            }

            @Override // X.C13930m5
            public void A02() {
                List list = this.A00;
                if (list != null && !this.A05) {
                    this.A00 = list;
                    if (this.A06) {
                        super.A04(list);
                    }
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

            @Override // X.C13930m5
            public void A04(Object obj) {
                List list = (List) obj;
                if (this.A05) {
                    return;
                }
                this.A00 = list;
                if (this.A06) {
                    super.A04(list);
                }
            }

            @Override // X.AbstractC28721Ti
            public Object A07() {
                ArrayList arrayList = new ArrayList(128);
                for (File file : this.A03) {
                    File[] listFiles = file.listFiles(new FileFilter() { // from class: X.1GY
                        @Override // java.io.FileFilter
                        public final boolean accept(File file2) {
                            if (file2.isFile()) {
                                C0DD.A0M(AnonymousClass024.A0G(file2.getAbsolutePath()));
                                return true;
                            }
                            return false;
                        }
                    });
                    if (listFiles != null) {
                        long A07 = this.A01.A07(C01C.A2w) * 1048576;
                        for (File file2 : listFiles) {
                            C1KT c1kt = new C1KT(file2);
                            if (c1kt.A01 <= A07) {
                                arrayList.add(c1kt);
                            }
                        }
                    }
                }
                C002301c c002301c = this.A02;
                if (0 != 0) {
                    if (0 == 1) {
                        Collections.sort(arrayList, C25631Gd.A00);
                    }
                    return arrayList;
                }
                Collator collator = Collator.getInstance(c002301c.A0I());
                collator.setDecomposition(1);
                Collections.sort(arrayList, new C25601Ga(collator));
                return arrayList;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0010, code lost:
        if (r6.isEmpty() != false) goto L7;
     */
    @Override // X.C0HQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void ALT(X.C13930m5 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.util.List r6 = (java.util.List) r6
            r4.A0A = r6
            android.view.MenuItem r3 = r4.A01
            r2 = 1
            if (r3 == 0) goto L16
            if (r6 == 0) goto L12
            boolean r1 = r6.isEmpty()
            r0 = 1
            if (r1 == 0) goto L13
        L12:
            r0 = 0
        L13:
            r3.setVisible(r0)
        L16:
            java.lang.String r1 = r4.A08
            X.1KS r0 = r4.A03
            X.1KU r0 = r0.A00
            r0.filter(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L38
            java.util.List r0 = r4.A0A
            if (r0 == 0) goto L33
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L38
            boolean r0 = r4.A0C
            if (r0 != 0) goto L38
        L33:
            r4.A0C = r2
            r4.A1R()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DocumentPickerActivity.ALT(X.0m5, java.lang.Object):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APM(C0U0 c0u0) {
        super.APM(c0u0);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.primary_dark));
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APN(C0U0 c0u0) {
        super.APN(c0u0);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        Uri uri;
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 1) {
            if (i2 != -1) {
                if (i2 == 0) {
                    List list = this.A0A;
                    if (list == null || list.isEmpty()) {
                        finish();
                        return;
                    }
                    return;
                }
                return;
            }
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    ClipData.Item itemAt = clipData.getItemAt(i3);
                    if (itemAt != null && (uri = itemAt.getUri()) != null) {
                        arrayList.add(uri);
                    }
                }
            }
            if (arrayList.isEmpty() && (data = intent.getData()) != null) {
                arrayList.add(data);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator<? extends Parcelable> it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    grantUriPermission("com.whatsapp", (Uri) it.next(), 1);
                } catch (SecurityException e) {
                    Log.w("docpicker/permission ", e);
                }
            }
            AbstractC005302j abstractC005302j = this.A07;
            List list2 = this.A0A;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", abstractC005302j.getRawString());
            bundle.putParcelableArrayList("uri_list", arrayList);
            bundle.putBoolean("finish_on_cancel", z);
            sendDocumentsConfirmationDialogFragment.A0P(bundle);
            sendDocumentsConfirmationDialogFragment.A14(A0N(), null);
        }
    }

    @Override // X.C0W0, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.documents);
        C0U1 A0c = A0c();
        if (A0c != null) {
            boolean z = true;
            A0c.A0L(true);
            AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
            C000700j.A04(A02, "rawJid is not a valid chat jid string");
            this.A07 = A02;
            this.A00 = ((ActivityC02290Ap) this).A0F.A00.getInt("document_picker_sort", this.A00);
            setContentView(R.layout.document_picker);
            this.A03 = new C1KS(this);
            if (Build.VERSION.SDK_INT >= 19) {
                A1P().addHeaderView(getLayoutInflater().inflate(R.layout.document_picker_header, (ViewGroup) null, false));
            }
            A1Q(this.A03);
            A1P().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.1GZ
                {
                    DocumentPickerActivity.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    DocumentPickerActivity documentPickerActivity = DocumentPickerActivity.this;
                    int headerViewsCount = i - documentPickerActivity.A1P().getHeaderViewsCount();
                    if (headerViewsCount < 0) {
                        documentPickerActivity.A1R();
                        return;
                    }
                    C1KT c1kt = (C1KT) documentPickerActivity.A0B.get(headerViewsCount);
                    if (documentPickerActivity.A02 != null) {
                        documentPickerActivity.A1S(c1kt);
                    } else {
                        documentPickerActivity.A1T(Collections.singletonList(c1kt));
                    }
                }
            });
            A1P().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: X.1GX
                {
                    DocumentPickerActivity.this = this;
                }

                @Override // android.widget.AdapterView.OnItemLongClickListener
                public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                    DocumentPickerActivity documentPickerActivity = DocumentPickerActivity.this;
                    int headerViewsCount = i - documentPickerActivity.A1P().getHeaderViewsCount();
                    if (headerViewsCount >= 0) {
                        C1KT c1kt = (C1KT) documentPickerActivity.A0B.get(headerViewsCount);
                        if (documentPickerActivity.A02 != null) {
                            documentPickerActivity.A1S(c1kt);
                        } else {
                            List list = documentPickerActivity.A0E;
                            list.clear();
                            list.add(c1kt);
                            AnonymousClass088.A1C(documentPickerActivity, ((ActivityC02290Ap) documentPickerActivity).A0E, documentPickerActivity.getResources().getQuantityString(R.plurals.n_items_selected, list.size(), Integer.valueOf(list.size())));
                            documentPickerActivity.A02 = documentPickerActivity.A0e(documentPickerActivity.A0D);
                            documentPickerActivity.A03.notifyDataSetChanged();
                            return true;
                        }
                    }
                    return true;
                }
            });
            this.A0C = (bundle == null || !bundle.getBoolean("system_picker_auto_started")) ? false : false;
            C0m3.A00(this).A01(0, null, this);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r1 != false) goto L10;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        /*
            r4 = this;
            android.view.MenuInflater r1 = r4.getMenuInflater()
            r0 = 2131623942(0x7f0e0006, float:1.887505E38)
            r1.inflate(r0, r5)
            X.0U1 r0 = r4.A0c()
            if (r0 == 0) goto L9c
            android.content.Context r2 = r0.A02()
            r1 = 2131951931(0x7f13013b, float:1.954029E38)
            r0 = 0
            androidx.appcompat.widget.SearchView r3 = new androidx.appcompat.widget.SearchView
            r3.<init>(r2, r0, r1)
            r0 = 2131364414(0x7f0a0a3e, float:1.8348664E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131100004(0x7f060164, float:1.7812377E38)
            int r0 = X.C02160Ac.A00(r4, r0)
            r1.setTextColor(r0)
            r0 = 2131889511(0x7f120d67, float:1.9413688E38)
            java.lang.String r0 = r4.getString(r0)
            r3.setQueryHint(r0)
            X.1il r0 = new X.1il
            r0.<init>()
            r3.A0B = r0
            r0 = 2131363568(0x7f0a06f0, float:1.8346948E38)
            android.view.MenuItem r2 = r5.findItem(r0)
            r4.A01 = r2
            java.util.List r0 = r4.A0A
            if (r0 == 0) goto L55
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L56
        L55:
            r0 = 0
        L56:
            r2.setVisible(r0)
            android.view.MenuItem r0 = r4.A01
            r0.setActionView(r3)
            android.view.MenuItem r1 = r4.A01
            r0 = 10
            r1.setShowAsAction(r0)
            android.view.MenuItem r1 = r4.A01
            X.1KR r0 = new X.1KR
            r0.<init>()
            r1.setOnActionExpandListener(r0)
            r0 = 2131100003(0x7f060163, float:1.7812375E38)
            int r2 = X.C02160Ac.A00(r4, r0)
            android.view.MenuItem r0 = r4.A01
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            android.graphics.drawable.Drawable r1 = X.C02180Ae.A0Q(r0, r2)
            android.view.MenuItem r0 = r4.A01
            r0.setIcon(r1)
            r0 = 2131363580(0x7f0a06fc, float:1.8346973E38)
            android.view.MenuItem r1 = r5.findItem(r0)
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            android.graphics.drawable.Drawable r0 = X.C02180Ae.A0Q(r0, r2)
            r1.setIcon(r0)
            boolean r0 = super.onCreateOptionsMenu(r5)
            return r0
        L9c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DocumentPickerActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_sort_by_name) {
            this.A00 = 0;
            ((ActivityC02290Ap) this).A0F.A0D().putInt("document_picker_sort", 0).apply();
            invalidateOptionsMenu();
            filter(this.A08);
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_sort_by_date) {
            this.A00 = 1;
            ((ActivityC02290Ap) this).A0F.A0D().putInt("document_picker_sort", 1).apply();
            invalidateOptionsMenu();
            filter(this.A08);
            return true;
        } else {
            if (menuItem.getItemId() == 16908332) {
                finish();
            }
            return true;
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menuitem_sort_by_name);
        MenuItem findItem2 = menu.findItem(R.id.menuitem_sort_by_date);
        if (this.A00 == 0) {
            findItem.setChecked(true);
            return true;
        }
        findItem2.setChecked(true);
        return true;
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("system_picker_auto_started", this.A0C);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        try {
            super.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("docpicker/pick-from-doc-provider ", e);
            ((ActivityC02290Ap) this).A0A.A07(R.string.activity_not_found, 0);
        }
    }

    /* loaded from: classes.dex */
    public class SendDocumentsConfirmationDialogFragment extends Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment {
        public C05W A00;
        public C018708s A01;
        public C02E A02;
        public C40081rY A03;

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            String quantityString;
            C05W c05w = this.A00;
            AbstractC005302j A02 = AbstractC005302j.A02(A02().getString("jid"));
            if (A02 != null) {
                C06C A0A = c05w.A0A(A02);
                Object A08 = this.A01.A08(A0A, false);
                final ArrayList parcelableArrayList = A02().getParcelableArrayList("uri_list");
                if (parcelableArrayList != null) {
                    Boolean valueOf = Boolean.valueOf(A02().getBoolean("finish_on_cancel"));
                    if (valueOf != null) {
                        final boolean booleanValue = valueOf.booleanValue();
                        String A07 = C460324r.A07(this.A02, (Uri) parcelableArrayList.get(0));
                        if (!A0A.A0D() && !A0A.A0C()) {
                            if (parcelableArrayList.size() == 1 && !TextUtils.isEmpty(A07)) {
                                quantityString = A0G(R.string.confirm_send_document_title, A07, A08);
                            } else {
                                quantityString = A01().getQuantityString(R.plurals.confirm_send_documents_title, parcelableArrayList.size(), Integer.valueOf(parcelableArrayList.size()), A08);
                            }
                        } else if (parcelableArrayList.size() == 1 && !TextUtils.isEmpty(A07)) {
                            quantityString = A0G(R.string.group_confirm_send_document_title, A07, A08);
                        } else {
                            quantityString = A01().getQuantityString(R.plurals.group_confirm_send_documents_title, parcelableArrayList.size(), Integer.valueOf(parcelableArrayList.size()), A08);
                        }
                        C019208x c019208x = new C019208x(A09());
                        c019208x.A01.A0E = C002701i.A0g(quantityString, ((Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment) this).A00, this.A03);
                        c019208x.A06(R.string.send, new DialogInterface.OnClickListener() { // from class: X.1Gb
                            {
                                DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.this = this;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.this;
                                ArrayList<? extends Parcelable> arrayList = parcelableArrayList;
                                ActivityC02330At A09 = sendDocumentsConfirmationDialogFragment.A09();
                                if (A09 != null) {
                                    Intent intent = new Intent();
                                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                                    A09.setResult(-1, intent);
                                    A09.finish();
                                }
                            }
                        });
                        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.1Gc
                            {
                                DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.this = this;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ActivityC02330At A09;
                                DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.this;
                                if (booleanValue && (A09 = sendDocumentsConfirmationDialogFragment.A09()) != null) {
                                    A09.finish();
                                }
                            }
                        });
                        return c019208x.A00();
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }
}
