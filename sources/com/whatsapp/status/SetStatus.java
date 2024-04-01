package com.whatsapp.status;

import X.AbstractActivityC50092Ps;
import X.AnonymousClass008;
import X.AnonymousClass029;
import X.C002701i;
import X.C019208x;
import X.C02180Ae;
import X.C02L;
import X.C05X;
import X.C0GA;
import X.C0I3;
import X.C0I4;
import X.C0U1;
import X.C2Oc;
import X.C3X1;
import X.C54792jM;
import X.C81743pO;
import X.InterfaceC07770Zu;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.status.SetStatus;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class SetStatus extends AbstractActivityC50092Ps implements C2Oc {
    public static ArrayList A09;
    public View A00;
    public C02L A01;
    public C05X A02;
    public TextEmojiLabel A03;
    public AnonymousClass008 A04;
    public C3X1 A05;
    public boolean A06;
    public final Handler A07 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.3Wr
        {
            SetStatus.this = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            SetStatus setStatus = SetStatus.this;
            if (message.what == 1) {
                setStatus.A02.A03((String) message.obj, null);
            } else {
                ((ActivityC02290Ap) setStatus).A0A.A07(R.string.info_update_failed, 0);
            }
            C002701i.A18(setStatus, 2);
            return true;
        }
    });
    public final C0GA A08 = new C81743pO(this);

    @Override // X.C2Oc
    public void AI0(String str) {
    }

    public final void A1P() {
        AUh(EmojiEditTextBottomSheetDialogFragment.A00(4, R.string.add_info, R.string.no_empty_info, this.A02.A01(), 139, null, 16385));
    }

    public final void A1Q() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(openFileOutput("status", 0));
            StringBuilder sb = new StringBuilder();
            Iterator it = A09.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
            if (sb.length() > 1) {
                sb.deleteCharAt(sb.length() - 1);
            }
            objectOutputStream.writeObject(sb.toString());
            objectOutputStream.close();
        } catch (IOException e) {
            Log.e("SetStatus/writeStatusListString", e);
        }
    }

    public void A1R(String str) {
        if (A1F(R.string.about_update_no_network)) {
            return;
        }
        C002701i.A19(this, 2);
        if (!this.A02.A04(str, new InterfaceC07770Zu() { // from class: X.3pJ
            {
                SetStatus.this = this;
            }

            @Override // X.InterfaceC07770Zu
            public final void AS2(String str2) {
                SetStatus setStatus = SetStatus.this;
                setStatus.A06 = true;
                Handler handler = setStatus.A07;
                handler.removeMessages(0);
                handler.sendMessage(Message.obtain(handler, 1, str2));
            }
        }, new C0I3() { // from class: X.3pI
            {
                SetStatus.this = this;
            }

            @Override // X.C0I3
            public final void ARv(int i) {
                Handler handler = SetStatus.this.A07;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
            }
        }, new C0I4() { // from class: X.3pH
            {
                SetStatus.this = this;
            }

            @Override // X.C0I4
            public final void ARz(Exception exc) {
                Handler handler = SetStatus.this.A07;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
            }
        }, null)) {
            Handler handler = this.A07;
            handler.removeMessages(0);
            handler.sendEmptyMessage(0);
        }
        this.A07.sendEmptyMessageDelayed(0, 32000L);
    }

    @Override // X.C2Oc
    public void AJh(int i, String str) {
        if (i != 4 || str.length() <= 0 || str.equals(this.A03.getText().toString())) {
            return;
        }
        this.A00.setOnClickListener(null);
        A1R(str);
    }

    public /* synthetic */ void lambda$onCreate$2421$SetStatus(View view) {
        A1P();
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (menuItem.getItemId() != 1) {
            return true;
        }
        A09.remove(adapterContextMenuInfo.position);
        notifyDataSetChanged();
        A1Q();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.widget.ListAdapter, X.3X1] */
    @Override // X.AbstractActivityC50092Ps, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        ObjectInputStream objectInputStream;
        String[] split;
        TypedArray obtainTypedArray;
        super.onCreate(bundle);
        setTitle(R.string.my_info);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(R.layout.setstatus);
        View findViewById = findViewById(R.id.status_layout);
        this.A00 = findViewById;
        findViewById.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 16));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.status_tv);
        this.A03 = textEmojiLabel;
        textEmojiLabel.A03(this.A02.A01());
        try {
            if (new File(getFilesDir(), "status").exists()) {
                try {
                    objectInputStream = new ObjectInputStream(openFileInput("status"));
                } catch (IOException e) {
                    Log.e(e);
                } catch (ClassNotFoundException e2) {
                    Log.w("create/status/serialization_error", e2);
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    A09 = arrayList;
                    for (String str : ((String) objectInputStream.readObject()).split("\n")) {
                        if (str.length() > 0) {
                            arrayList.add(str);
                        }
                    }
                    objectInputStream.close();
                    AbsListView absListView = (AbsListView) findViewById(R.id.list);
                    absListView.setEmptyView(findViewById(R.id.list_empty));
                    ?? r0 = new ArrayAdapter(this, A09) { // from class: X.3X1
                        public ArrayList A00;

                        {
                            SetStatus.this = this;
                            this.A00 = r4;
                        }

                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public View getView(int i, View view, ViewGroup viewGroup) {
                            TextEmojiLabel textEmojiLabel2;
                            if (view == null) {
                                view = ((LayoutInflater) SetStatus.this.getSystemService("layout_inflater")).inflate(R.layout.setstatus_row, (ViewGroup) null);
                            }
                            String str2 = (String) this.A00.get(i);
                            if (str2 != null && (textEmojiLabel2 = (TextEmojiLabel) view.findViewById(R.id.status_row)) != null) {
                                View findViewById2 = view.findViewById(R.id.status_selected_check);
                                SetStatus setStatus = SetStatus.this;
                                findViewById2.setVisibility(str2.equals(setStatus.A02.A01()) ? 0 : 4);
                                findViewById2.setContentDescription(setStatus.getString(R.string.checked_icon_label));
                                textEmojiLabel2.A06(str2, null, false, 0);
                            }
                            return view;
                        }
                    };
                    this.A05 = r0;
                    absListView.setAdapter((ListAdapter) r0);
                    absListView.setOnItemClickListener(new C54792jM(this));
                    registerForContextMenu(absListView);
                    this.A04.A01(this.A08);
                    C02180Ae.A17((ImageView) findViewById(R.id.status_tv_edit_icon), AnonymousClass029.A03(this, R.attr.settingsGrayButtonColor, R.color.settings_edit_btn));
                    return;
                } finally {
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                arrayList2.add(obtainTypedArray.getString(i));
            }
            obtainTypedArray.recycle();
            A09 = arrayList2;
            AbsListView absListView2 = (AbsListView) findViewById(R.id.list);
            absListView2.setEmptyView(findViewById(R.id.list_empty));
            ?? r02 = new ArrayAdapter(this, A09) { // from class: X.3X1
                public ArrayList A00;

                {
                    SetStatus.this = this;
                    this.A00 = r4;
                }

                @Override // android.widget.ArrayAdapter, android.widget.Adapter
                public View getView(int i2, View view, ViewGroup viewGroup) {
                    TextEmojiLabel textEmojiLabel2;
                    if (view == null) {
                        view = ((LayoutInflater) SetStatus.this.getSystemService("layout_inflater")).inflate(R.layout.setstatus_row, (ViewGroup) null);
                    }
                    String str2 = (String) this.A00.get(i2);
                    if (str2 != null && (textEmojiLabel2 = (TextEmojiLabel) view.findViewById(R.id.status_row)) != null) {
                        View findViewById2 = view.findViewById(R.id.status_selected_check);
                        SetStatus setStatus = SetStatus.this;
                        findViewById2.setVisibility(str2.equals(setStatus.A02.A01()) ? 0 : 4);
                        findViewById2.setContentDescription(setStatus.getString(R.string.checked_icon_label));
                        textEmojiLabel2.A06(str2, null, false, 0);
                    }
                    return view;
                }
            };
            this.A05 = r02;
            absListView2.setAdapter((ListAdapter) r02);
            absListView2.setOnItemClickListener(new C54792jM(this));
            registerForContextMenu(absListView2);
            this.A04.A01(this.A08);
            C02180Ae.A17((ImageView) findViewById(R.id.status_tv_edit_icon), AnonymousClass029.A03(this, R.attr.settingsGrayButtonColor, R.color.settings_edit_btn));
            return;
        } catch (Throwable th) {
            obtainTypedArray.recycle();
            throw th;
        }
        obtainTypedArray = getResources().obtainTypedArray(R.array.default_statuses);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, R.string.delete_info);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    progressDialog.setMessage(getString(R.string.info_update_dialog_title));
                    progressDialog.setIndeterminate(true);
                    progressDialog.setCancelable(false);
                    return progressDialog;
                } else if (i != 3) {
                    return super.onCreateDialog(i);
                } else {
                    C019208x c019208x = new C019208x(this);
                    c019208x.A02(R.string.delete_all_confirm);
                    c019208x.A06(R.string.delete_all, new DialogInterface.OnClickListener() { // from class: X.3Wq
                        {
                            SetStatus.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            SetStatus setStatus = SetStatus.this;
                            C002701i.A18(setStatus, 3);
                            SetStatus.A09.clear();
                            setStatus.A1Q();
                            setStatus.A05.notifyDataSetChanged();
                        }
                    });
                    c019208x.A04(R.string.cancel, null);
                    return c019208x.A00();
                }
            }
            return ProgressDialog.show(this, getString(R.string.info_retrieve_dialog_title), getString(R.string.info_retrieve_dialog_message), true, false);
        }
        return ProgressDialog.show(this, getString(R.string.info_update_dialog_title), getString(R.string.info_update_dialog_message), true, false);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.delete_all);
        return true;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A04.A00(this.A08);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        } else if (A09.size() == 0) {
            AUj(R.string.no_info_to_delete);
            return true;
        } else {
            C002701i.A19(this, 3);
            return true;
        }
    }
}
