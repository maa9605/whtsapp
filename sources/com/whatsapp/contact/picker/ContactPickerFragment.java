package com.whatsapp.contact.picker;

import X.AbstractC005302j;
import X.AbstractC011205o;
import X.AbstractC02750Cs;
import X.AbstractC02800Cx;
import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02330At;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.AnonymousClass031;
import X.AnonymousClass075;
import X.C000200d;
import X.C000500h;
import X.C000700j;
import X.C002301c;
import X.C002701i;
import X.C003101m;
import X.C003301p;
import X.C003701t;
import X.C006602x;
import X.C012205z;
import X.C018308n;
import X.C018508q;
import X.C018608r;
import X.C018708s;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C01C;
import X.C02160Ac;
import X.C02180Ae;
import X.C02770Cu;
import X.C02780Cv;
import X.C02820Cz;
import X.C02C;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03010Du;
import X.C03320Ff;
import X.C03360Fk;
import X.C03730Gv;
import X.C03860Hk;
import X.C04310Jr;
import X.C04630Le;
import X.C05E;
import X.C05M;
import X.C05W;
import X.C05Y;
import X.C06950Vu;
import X.C06C;
import X.C07630Zb;
import X.C0AT;
import X.C0C8;
import X.C0CA;
import X.C0CB;
import X.C0DD;
import X.C0E7;
import X.C0EB;
import X.C0ED;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0HA;
import X.C0HC;
import X.C0HS;
import X.C0L5;
import X.C0L8;
import X.C0LX;
import X.C0M7;
import X.C0MO;
import X.C0O4;
import X.C0O8;
import X.C0U0;
import X.C0U1;
import X.C0W5;
import X.C0WZ;
import X.C0We;
import X.C0Zn;
import X.C1Lh;
import X.C1P5;
import X.C2AR;
import X.C2L9;
import X.C2MD;
import X.C36771lL;
import X.C40071rX;
import X.C40081rY;
import X.C40261rr;
import X.C40951t8;
import X.C41321tj;
import X.C41961un;
import X.C42041uv;
import X.C42371vd;
import X.C42461vm;
import X.C43301xB;
import X.C43321xD;
import X.C468928r;
import X.C52762bH;
import X.C54532iu;
import X.C54552iw;
import X.C57942qK;
import X.C57952qL;
import X.C651536c;
import X.C651936g;
import X.C652036h;
import X.C652136i;
import X.C652536m;
import X.InterfaceC002901k;
import X.InterfaceC05830Qk;
import X.InterfaceC07650Zd;
import X.InterfaceC54742jH;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.base.WaFragment;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class ContactPickerFragment extends Hilt_ContactPickerFragment {
    public static boolean A1z;
    public byte A00;
    public int A01;
    public long A02;
    public long A03;
    public MenuItem A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ImageView A09;
    public ListView A0A;
    public C0O8 A0B;
    public C0U0 A0C;
    public C018308n A0D;
    public AnonymousClass031 A0E;
    public C018508q A0F;
    public C02L A0G;
    public C06950Vu A0H;
    public C07630Zb A0I;
    public C03010Du A0J;
    public C01B A0K;
    public C0W5 A0L;
    public TextEmojiLabel A0M;
    public C018608r A0N;
    public C0L8 A0O;
    public C40261rr A0P;
    public C0GC A0Q;
    public C03320Ff A0R;
    public C05W A0S;
    public C0GA A0T;
    public AnonymousClass008 A0U;
    public C42371vd A0V;
    public AnonymousClass075 A0W;
    public C018708s A0X;
    public C0Zn A0Y;
    public C0L5 A0Z;
    public C54552iw A0a;
    public C54532iu A0b;
    public C651936g A0c;
    public C652036h A0d;
    public C652136i A0e;
    public C652536m A0f;
    public C2L9 A0g;
    public C41321tj A0h;
    public C0O4 A0i;
    public C012205z A0j;
    public C468928r A0k;
    public C0E7 A0l;
    public C02E A0m;
    public C02F A0n;
    public C000500h A0o;
    public C002301c A0p;
    public C05M A0q;
    public C0CA A0r;
    public C03730Gv A0s;
    public C0C8 A0t;
    public C05E A0u;
    public C0WZ A0v;
    public C0EB A0w;
    public C06C A0x;
    public C40081rY A0y;
    public C003701t A0z;
    public C0HA A10;
    public AnonymousClass011 A11;
    public C0GE A12;
    public C03360Fk A13;
    public AbstractC005302j A14;
    public C05Y A15;
    public C02O A16;
    public C0CB A17;
    public C2MD A18;
    public C2AR A19;
    public C40071rX A1A;
    public C42461vm A1B;
    public C52762bH A1C;
    public C006602x A1D;
    public C02C A1E;
    public C41961un A1F;
    public InterfaceC002901k A1G;
    public C40951t8 A1H;
    public Long A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1Q;
    public String A1R;
    public String A1S;
    public ArrayList A1T;
    public ArrayList A1U;
    public ArrayList A1V;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public final Runnable A1t;
    public final Set A1y;
    public final List A1v = new ArrayList();
    public final Handler A1s = new Handler(Looper.getMainLooper());
    public final Map A1w = new LinkedHashMap();
    public final Set A1x = new HashSet();
    public String A1P = "";
    public final HashSet A1u = new HashSet();
    public List A1W = new ArrayList();
    public List A1Z = new ArrayList();
    public List A1X = new ArrayList();
    public List A1Y = new ArrayList();

    public String A12(C06C c06c) {
        return null;
    }

    public boolean A1S() {
        return true;
    }

    public ContactPickerFragment() {
        HashSet hashSet = new HashSet();
        this.A1y = hashSet;
        this.A1t = new RunnableEBaseShape1S0100000_I0_1(hashSet, 39);
    }

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        View view;
        if (i == 1) {
            if (!this.A0w.A0H() || (view = this.A08) == null) {
                return;
            }
            view.setVisibility(8);
            this.A08 = null;
        } else if (i == 2) {
            if (i2 != -1) {
                return;
            }
            this.A0a.A00();
        } else if (i != 3) {
            if (i == 151 && i2 == -1) {
                A1M(null);
            }
        } else {
            this.A1C.A00();
        }
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        boolean z;
        super.A0U = true;
        C0HC c0hc = new C0HC("contactpicker/onactivitycreated");
        this.A0Y = this.A0Z.A04(A0a());
        Toolbar toolbar = (Toolbar) this.A07.findViewById(R.id.toolbar);
        this.A0a.A00.A0k(toolbar);
        this.A0I = new C07630Zb(A09(), this.A0p, this.A07.findViewById(R.id.search_holder), toolbar, new InterfaceC07650Zd() { // from class: X.36X
            @Override // X.InterfaceC07650Zd
            public boolean ANY(String str) {
                return false;
            }

            {
                ContactPickerFragment.this = this;
            }

            @Override // X.InterfaceC07650Zd
            public boolean ANX(String str) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                contactPickerFragment.A1M = str;
                ArrayList A03 = C09940f2.A03(str, contactPickerFragment.A0p);
                contactPickerFragment.A1T = A03;
                if (A03.isEmpty()) {
                    contactPickerFragment.A1T = null;
                }
                contactPickerFragment.A17();
                return false;
            }
        });
        C0U1 A11 = A11();
        A11.A0L(true);
        A11.A08(R.string.whatsapp_contacts);
        C54552iw c54552iw = this.A0a;
        c54552iw.A00.A0m(this.A0k.A0R.get());
        if (bundle != null && bundle.containsKey("request_sync")) {
            z = bundle.getBoolean("request_sync", false);
        } else {
            z = A0z().getBoolean("request_sync", false);
        }
        this.A1e = z;
        C05E c05e = this.A0u;
        c05e.A05();
        if (!c05e.A01) {
            A1z = true;
            if (this.A0a.A00.A1U()) {
                this.A0a.A00.A01.A08();
            }
        } else {
            A15();
        }
        if (!this.A1w.isEmpty()) {
            if (!this.A1r && !this.A1l && !this.A1p) {
                if (this.A0C == null) {
                    C0O8 c0o8 = this.A0B;
                    if (c0o8 == null) {
                        c0o8 = new C651536c(this);
                        this.A0B = c0o8;
                    }
                    this.A0C = this.A0a.A00.A0e(c0o8);
                }
                A1D();
            } else {
                this.A06.setVisibility(0);
                this.A09.setVisibility(0);
                A1A();
            }
        }
        if (bundle != null) {
            this.A0I.A02(bundle);
        }
        c0hc.A01();
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        Jid A03;
        bundle.putBoolean("request_sync", this.A1e);
        C06C c06c = this.A0x;
        if (c06c != null && (A03 = c06c.A03(AbstractC005302j.class)) != null) {
            bundle.putString("jid", A03.getRawString());
        }
        Map map = this.A1w;
        if (!map.isEmpty()) {
            bundle.putStringArrayList("selected_jids", C003101m.A0E(map.keySet()));
        }
        this.A0I.A03(bundle);
    }

    @Override // X.C0BA
    public void A0m(Menu menu, MenuInflater menuInflater) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.search).setIcon(R.drawable.ic_action_search);
        this.A04 = icon;
        icon.setShowAsAction(10);
        this.A04.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: X.2qG
            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return true;
            }

            {
                ContactPickerFragment.this = this;
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                contactPickerFragment.A1T = null;
                contactPickerFragment.A17();
                return true;
            }
        });
        this.A04.setVisible(!this.A1W.isEmpty());
        if (A1W()) {
            menu.add(0, R.id.menuitem_tell_friend, 0, R.string.tell_a_friend);
            menu.add(0, R.id.menuitem_contacts, 0, R.string.menuitem_contacts);
            menu.add(0, R.id.menuitem_refresh, 0, R.string.menuitem_refresh);
            menu.add(0, R.id.menuitem_contacts_help, 0, R.string.settings_help);
        }
    }

    @Override // X.C0BA
    public boolean A0n(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        ListView listView = this.A0A;
        if (listView == null) {
            listView = (ListView) this.A07.findViewById(16908298);
            this.A0A = listView;
        }
        C06C A93 = ((InterfaceC54742jH) listView.getItemAtPosition(adapterContextMenuInfo.position)).A93();
        if (A93 != null && menuItem.getItemId() == 0) {
            C40261rr c40261rr = this.A0P;
            ActivityC02330At A09 = A09();
            Jid A03 = A93.A03(UserJid.class);
            if (A03 != null) {
                c40261rr.A07(A09, null, (UserJid) A03);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override // X.C0BA
    public boolean A0o(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_refresh) {
            this.A0a.A00.A0m(true);
            A19();
        } else if (itemId == R.id.menuitem_contacts) {
            PackageManager packageManager = A0a().getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", ContactsContract.Contacts.CONTENT_URI);
            intent.setComponent(intent.resolveActivity(packageManager));
            if (intent.getComponent() != null) {
                A0i(intent);
                return true;
            }
            try {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.android.contacts");
                if (launchIntentForPackage == null) {
                    this.A0F.A07(R.string.view_contact_unsupport, 0);
                    return true;
                }
                A0i(launchIntentForPackage);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.w("contact_picker/options/system contacts app could not found", e);
                this.A0F.A07(R.string.view_contact_unsupport, 0);
                return true;
            }
        } else if (itemId == R.id.menuitem_tell_friend) {
            this.A0L.A01(A09(), Integer.valueOf(this.A1h ? 7 : 4));
            return true;
        } else if (itemId == R.id.menuitem_search) {
            this.A0I.A01();
            return true;
        } else if (itemId == R.id.menuitem_contacts_help) {
            A0i(new Intent(A0a(), ContactPickerHelp.class));
            return true;
        } else if (itemId == 16908332) {
            this.A0a.A00();
            return true;
        }
        return true;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.contact_picker_fragment, viewGroup, false);
        this.A07 = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.send);
        this.A09 = imageView;
        imageView.setImageDrawable(new C0We(this.A0p, C02160Ac.A03(A0a(), R.drawable.input_send)));
        this.A09.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.36W
            {
                ContactPickerFragment.this = this;
            }

            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                if (contactPickerFragment.A1r) {
                    contactPickerFragment.A1M(null);
                } else if (!contactPickerFragment.A1l && !contactPickerFragment.A1p) {
                } else {
                    Intent intent = new Intent();
                    Map map = contactPickerFragment.A1w;
                    intent.putStringArrayListExtra("jids", C003101m.A0E(map.keySet()));
                    intent.putExtra("file_path", contactPickerFragment.A0z().getString("file_path"));
                    if (contactPickerFragment.A1l) {
                        contactPickerFragment.A10.A08(false, map.size());
                    }
                    AnonymousClass094 A03 = C0LD.A03(contactPickerFragment.A0z(), "");
                    if (A03 != null) {
                        C0LD.A00(intent, A03);
                    }
                    contactPickerFragment.A0a.A01(intent);
                    contactPickerFragment.A0a.A00();
                }
            }
        });
        this.A0M = (TextEmojiLabel) this.A07.findViewById(R.id.recipients);
        View findViewById = this.A07.findViewById(R.id.recipients_container);
        this.A06 = findViewById;
        ((ImageView) findViewById.findViewById(R.id.recipients_chevron)).setImageDrawable(new C0We(this.A0p, C02160Ac.A03(A0a(), R.drawable.chevron_right)));
        return this.A07;
    }

    @Override // X.C0BA
    public void A0q() {
        super.A0U = true;
        C0GA c0ga = this.A0T;
        if (c0ga != null) {
            this.A0U.A00(c0ga);
            this.A0T = null;
        }
        C0GC c0gc = this.A0Q;
        if (c0gc != null) {
            this.A0R.A00(c0gc);
            this.A0Q = null;
        }
        C0O4 c0o4 = this.A0i;
        if (c0o4 != null) {
            this.A0j.A00(c0o4);
            this.A0i = null;
        }
        C0GE c0ge = this.A12;
        if (c0ge != null) {
            this.A13.A00(c0ge);
            this.A12 = null;
        }
        this.A0Y.A00();
        C651936g c651936g = this.A0c;
        if (c651936g != null) {
            c651936g.A05(true);
            this.A0c = null;
        }
        C652536m c652536m = this.A0f;
        if (c652536m != null) {
            c652536m.A05(true);
            this.A0f = null;
        }
        C652136i c652136i = this.A0e;
        if (c652136i != null) {
            c652136i.A05(true);
            this.A0e = null;
        }
        C652036h c652036h = this.A0d;
        if (c652036h != null) {
            c652036h.A05(true);
            this.A0d = null;
        }
    }

    @Override // X.C0BA
    public void A0s() {
        super.A0U = true;
        if (A1z) {
            return;
        }
        C03860Hk.A00(1);
        A13();
    }

    @Override // com.whatsapp.contact.picker.Hilt_ContactPickerFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A1C = new C52762bH(this.A11, this.A0K, this.A0m, this.A0n);
        try {
            this.A0a = ((C0MO) context).AAX();
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement ContactPickerFragment$HostProvider");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        List<AbstractC005302j> A0F;
        super.A0v(bundle);
        if (bundle != null) {
            AbstractC005302j A02 = AbstractC005302j.A02(bundle.getString("jid"));
            if (A02 != null) {
                this.A0x = this.A0S.A0A(A02);
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("selected_jids");
            if (stringArrayList != null && (A0F = C003101m.A0F(AbstractC005302j.class, stringArrayList)) != null && !A0F.isEmpty()) {
                Map map = this.A1w;
                map.clear();
                for (AbstractC005302j abstractC005302j : A0F) {
                    C06C A09 = this.A0S.A09(abstractC005302j);
                    if (A09 != null) {
                        map.put(abstractC005302j, A09);
                    }
                }
            }
        }
        A0J();
    }

    public Dialog A0y(int i) {
        String A0G;
        String A0G2;
        ActivityC02330At A09 = A09();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                String A0G3 = A0G(R.string.group_confirm_set_icon, this.A0X.A08(this.A0x, false));
                C019208x c019208x = new C019208x(A0a());
                CharSequence A0g = C002701i.A0g(A0G3, A09, this.A0y);
                C019308y c019308y = c019208x.A01;
                c019308y.A0E = A0g;
                c019308y.A0J = true;
                c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2q4
                    {
                        ContactPickerFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C002701i.A18(ContactPickerFragment.this.A09(), 3);
                    }
                });
                c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2px
                    {
                        ContactPickerFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                        Intent intent = new Intent();
                        Jid A02 = contactPickerFragment.A0x.A02();
                        if (A02 != null) {
                            intent.putExtra("contact", A02.getRawString());
                            intent.putExtra("message_row_id", contactPickerFragment.A0z().getLong("message_row_id"));
                            contactPickerFragment.A0a.A01(intent);
                            C002701i.A18(contactPickerFragment.A09(), 3);
                            contactPickerFragment.A0a.A00();
                            return;
                        }
                        throw null;
                    }
                });
                c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.2pz
                    {
                        ContactPickerFragment.this = this;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        C002701i.A18(ContactPickerFragment.this.A09(), 3);
                    }
                };
                return c019208x.A00();
            }
            if (this.A0x.A0C()) {
                A0G2 = A0G(R.string.group_confirm_forward_msg, this.A0X.A08(this.A0x, false));
            } else {
                A0G2 = A0G(R.string.confirm_forward_msg, this.A0X.A08(this.A0x, false));
            }
            C019208x c019208x2 = new C019208x(A0a());
            CharSequence A0g2 = C002701i.A0g(A0G2, A09, this.A0y);
            C019308y c019308y2 = c019208x2.A01;
            c019308y2.A0E = A0g2;
            c019308y2.A0J = true;
            c019208x2.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2q3
                {
                    ContactPickerFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C002701i.A18(ContactPickerFragment.this.A09(), 2);
                }
            });
            c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2q7
                {
                    ContactPickerFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                    Intent intent = new Intent();
                    ArrayList<String> arrayList = new ArrayList<>(1);
                    Jid A02 = contactPickerFragment.A0x.A02();
                    if (A02 != null) {
                        arrayList.add(A02.getRawString());
                        intent.putStringArrayListExtra("jids", arrayList);
                        intent.putExtra("file_path", contactPickerFragment.A0z().getString("file_path"));
                        contactPickerFragment.A0a.A01(intent);
                        C002701i.A18(contactPickerFragment.A09(), 2);
                        contactPickerFragment.A10.A08(false, 1);
                        contactPickerFragment.A0a.A00();
                        return;
                    }
                    throw null;
                }
            });
            c019308y2.A02 = new DialogInterface.OnCancelListener() { // from class: X.2q5
                {
                    ContactPickerFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C002701i.A18(ContactPickerFragment.this.A09(), 2);
                }
            };
            return c019208x2.A00();
        }
        Map map = this.A1w;
        if (map.size() == 1) {
            this.A0x = (C06C) map.values().iterator().next();
            map.clear();
        }
        if (!map.isEmpty()) {
            String A0D = this.A0X.A0D(map.values(), false);
            ArrayList arrayList = this.A1U;
            if (arrayList != null && arrayList.size() > 1) {
                A0G = this.A0p.A0A(R.plurals.confirm_sharing_multiple_title, arrayList.size(), Integer.valueOf(arrayList.size()), A0D);
            } else {
                A0G = A0G(R.string.confirm_sharing_title, A0D);
            }
        } else if (this.A0x.A0C()) {
            ArrayList arrayList2 = this.A1U;
            if (arrayList2 != null && arrayList2.size() > 1) {
                A0G = this.A0p.A0A(R.plurals.group_confirm_sharing_multiple_title, arrayList2.size(), Integer.valueOf(arrayList2.size()), this.A0X.A08(this.A0x, false));
            } else {
                A0G = A0G(R.string.group_confirm_sharing_title, this.A0X.A08(this.A0x, false));
            }
        } else {
            ArrayList arrayList3 = this.A1U;
            if (arrayList3 != null && arrayList3.size() > 1) {
                A0G = this.A0p.A0A(R.plurals.confirm_sharing_multiple_title, arrayList3.size(), Integer.valueOf(arrayList3.size()), this.A0X.A08(this.A0x, false));
            } else {
                A0G = A0G(R.string.confirm_sharing_title, this.A0X.A08(this.A0x, false));
            }
        }
        C019208x c019208x3 = new C019208x(A0a());
        CharSequence A0g3 = C002701i.A0g(A0G, A09, this.A0y);
        C019308y c019308y3 = c019208x3.A01;
        c019308y3.A0E = A0g3;
        c019308y3.A0J = true;
        c019208x3.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2pw
            {
                ContactPickerFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                C002701i.A18(contactPickerFragment.A09(), 1);
                C0U0 c0u0 = contactPickerFragment.A0C;
                if (c0u0 != null) {
                    c0u0.A05();
                }
            }
        });
        c019208x3.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2py
            {
                ContactPickerFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                C002701i.A18(contactPickerFragment.A09(), 1);
                contactPickerFragment.A1M(null);
            }
        });
        c019308y3.A02 = new DialogInterface.OnCancelListener() { // from class: X.2q6
            {
                ContactPickerFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                C002701i.A18(contactPickerFragment.A09(), 1);
                C0U0 c0u0 = contactPickerFragment.A0C;
                if (c0u0 != null) {
                    c0u0.A05();
                }
            }
        };
        return c019208x3.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x000b, code lost:
        if (r2 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle A0z() {
        /*
            r3 = this;
            android.os.Bundle r1 = r3.A06
            if (r1 == 0) goto L1b
            java.lang.String r0 = "extras"
            android.os.Bundle r2 = r1.getBundle(r0)
            r1 = 1
            if (r2 != 0) goto Le
        Ld:
            r1 = 0
        Le:
            java.lang.String r0 = "extras should not be null (it should be an empty bundle if there are nothing)"
            X.C000700j.A08(r1, r0)
            if (r2 != 0) goto L1a
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L1a:
            return r2
        L1b:
            r2 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A0z():android.os.Bundle");
    }

    public View A10(int i, int i2, int i3, View.OnClickListener onClickListener) {
        View inflate = A04().inflate(R.layout.contact_picker_row_small, (ViewGroup) null, false);
        if (this.A1f) {
            C02180Ae.A11(inflate);
        } else {
            inflate.setBackgroundResource(R.drawable.selector_orange_gradient);
        }
        ThumbnailButton thumbnailButton = (ThumbnailButton) inflate.findViewById(R.id.contactpicker_row_photo);
        thumbnailButton.setImageResource(i);
        thumbnailButton.setScaleType(ImageView.ScaleType.CENTER);
        thumbnailButton.setBackgroundResource(i2);
        thumbnailButton.A06 = true;
        TextView textView = (TextView) inflate.findViewById(R.id.contactpicker_row_name);
        C003301p.A06(textView);
        textView.setText(i3);
        inflate.findViewById(R.id.contactpicker_row_status).setVisibility(8);
        if (this.A1f) {
            A1I(inflate, inflate.findViewById(R.id.contactpicker_text_container));
        }
        inflate.setOnClickListener(onClickListener);
        FrameLayout frameLayout = new FrameLayout(A0a());
        frameLayout.addView(inflate);
        this.A1v.add(inflate);
        C0AT.A0V(frameLayout, 2);
        return frameLayout;
    }

    public C0U1 A11() {
        return this.A0a.A00.A0c();
    }

    public void A13() {
        this.A0b.notifyDataSetChanged();
        A1z = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00a5, code lost:
        if (r11.A1p != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A14() {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A14():void");
    }

    public void A15() {
        Parcelable parcelable;
        String A02;
        ComponentName component;
        AbstractC005302j A022;
        C06C A09;
        Bundle bundle = super.A06;
        Bundle A0z = A0z();
        String string = bundle.getString("action");
        Uri uri = A0z.get("uri") instanceof Uri ? (Uri) A0z.get("uri") : null;
        HashSet hashSet = this.A1u;
        hashSet.clear();
        this.A1b = A0z.getBoolean("enforce_hfm_limit", false);
        this.A1m = A0z.getBoolean("forward_ctwa", false);
        if (string != null && string.equals("android.intent.action.CREATE_SHORTCUT")) {
            this.A1i = true;
        } else if (A0z.getBoolean("call_picker", false)) {
            this.A1h = true;
        } else if (A0z.getBoolean("for_group_call", false)) {
            this.A1k = true;
            A11().A08(R.string.voip_call_add_person_description);
        } else if (A0z.getBoolean("for_payments", false)) {
            this.A1o = true;
        } else if (A0z.getBoolean("forward", false)) {
            A11().A08(R.string.forward_to);
            this.A1l = true;
            this.A14 = AbstractC005302j.A02(A0z.getString("forward_jid"));
            ArrayList<Integer> integerArrayList = A0z.getIntegerArrayList("message_types");
            if (integerArrayList != null) {
                hashSet.addAll(integerArrayList);
                this.A01 = A0z.getInt("forward_messages_becoming_frequently_forwarded", 0);
                this.A1c = A0z.getBoolean("forward_highly_forwarded", false);
            } else {
                throw null;
            }
        } else if (A0z.getBoolean("send", false)) {
            A11().A08(R.string.select_contacts);
            this.A1p = true;
            ArrayList<Integer> integerArrayList2 = A0z.getIntegerArrayList("message_types");
            if (integerArrayList2 != null) {
                hashSet.addAll(integerArrayList2);
                if (A0z.getBoolean("skip_preview", false)) {
                    this.A09.setImageDrawable(new C0We(this.A0p, C02160Ac.A03(A0a(), R.drawable.input_send)));
                } else {
                    this.A09.setImageDrawable(new C0We(this.A0p, C02160Ac.A03(A0a(), R.drawable.ic_action_arrow_next)));
                    A11().A08(R.string.send_to);
                }
            } else {
                throw null;
            }
        } else if (A0z.getBoolean("set_group_icon", false)) {
            A11().A08(R.string.contact_picker_choose_group);
            this.A1q = true;
        } else if (A0z.getBoolean("email_history", false)) {
            A11().A08(R.string.contact_picker_choose_chat);
            this.A1j = true;
        } else if (A0z.getBoolean("block_contact", false)) {
            this.A1g = true;
            ArrayList<String> stringArrayList = A0z.getStringArrayList("blocked_list");
            if (stringArrayList != null) {
                this.A1x.addAll(C003101m.A0F(AbstractC005302j.class, stringArrayList));
            }
        } else if (uri != null) {
            A11().A08(R.string.send_to);
            C1P5 A00 = C0ED.A00(this.A0v, uri);
            this.A00 = (byte) 0;
            String str = A00.A08;
            this.A1P = str;
            this.A1L = A00.A00;
            this.A1N = A00.A02;
            this.A1S = A00.A07;
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(A00.A04)) {
                    A1O("contactpicker/textanddirectchatlink/link-failed/no-text-or-phone", R.string.invalid_chat_link);
                } else {
                    C36771lL c36771lL = new C36771lL();
                    c36771lL.A00 = Boolean.TRUE;
                    c36771lL.A01 = Boolean.FALSE;
                    this.A11.A09(c36771lL, 1);
                    AnonymousClass011.A01(c36771lL, "");
                    if (this.A0d != null) {
                        Log.i("contactpicker/textanddirectchatlink/skip/synctask-already-exists");
                    } else {
                        A1P(A00.A04, false, A00.A01, A00.A06);
                    }
                }
            } else {
                this.A1d = true;
                C36771lL c36771lL2 = new C36771lL();
                c36771lL2.A00 = Boolean.valueOf(!TextUtils.isEmpty(A00.A04));
                c36771lL2.A01 = Boolean.TRUE;
                this.A11.A09(c36771lL2, 1);
                AnonymousClass011.A01(c36771lL2, "");
                if (!TextUtils.isEmpty(A00.A04)) {
                    if (this.A0d != null) {
                        Log.i("contactpicker/textanddirectchatlink/skip/synctask-already-exists");
                    } else {
                        A1P(A00.A04, true, A00.A01, A00.A06);
                    }
                } else {
                    String str2 = A00.A05;
                    if (str2 != null) {
                        C06950Vu c06950Vu = this.A0H;
                        if (str2.equals(c06950Vu.A03.A00.getString("return_chat_id", null)) && (A022 = AbstractC005302j.A02(c06950Vu.A03.A00.getString("return_chat_jid", null))) != null) {
                            A1M(new C06C(A022));
                            C06950Vu c06950Vu2 = this.A0H;
                            C000200d.A0i(c06950Vu2.A03, "return_chat_jid", null);
                            C000200d.A0i(c06950Vu2.A03, "return_chat_id", null);
                        }
                    }
                }
            }
            this.A1a = false;
            this.A1r = true;
            hashSet.add(0);
        } else if (!A0z.isEmpty()) {
            A11().A08(R.string.send_to);
            this.A1a = true;
            this.A1r = true;
            String string2 = bundle.getString("type");
            this.A1O = string2;
            if (string2 == null) {
                StringBuilder A0P = C000200d.A0P("contactpicker/type/null ");
                A0P.append(A0z.toString());
                Log.i(A0P.toString());
                if (A0z.containsKey("android.intent.extra.TEXT")) {
                    this.A00 = (byte) 0;
                } else {
                    this.A0F.A07(R.string.share_file_format_unsupport, 0);
                    this.A0a.A00();
                    return;
                }
            } else {
                byte A002 = C0DD.A00(string2);
                this.A00 = A002;
                if (A002 == 0 && A0z.containsKey("android.intent.extra.STREAM")) {
                    this.A00 = (byte) 9;
                }
            }
            try {
                ActivityManager A01 = this.A0m.A01();
                if (A01 == null) {
                    Log.w("contactpicker/set am=null");
                } else {
                    for (ActivityManager.RecentTaskInfo recentTaskInfo : A01.getRecentTasks(4, 1)) {
                        Intent intent = recentTaskInfo.baseIntent;
                        if (intent != null && (component = intent.getComponent()) != null) {
                            String packageName = component.getPackageName();
                            if ("com.juggersoft.whatsappfilesender".equals(packageName) || "com.whatsend".equals(packageName)) {
                                A1O("contactpicker/share/badfile", R.string.cannot_share_selected_file);
                                return;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            byte b = this.A00;
            if (b != 0) {
                if (b == 4) {
                    if (A0z.containsKey("android.intent.extra.TEXT")) {
                        A02 = A0z.getCharSequence("android.intent.extra.TEXT").toString();
                        StringBuilder A0P2 = C000200d.A0P("contactpicker/share/text [");
                        A0P2.append(A02.length());
                        A0P2.append("]");
                        Log.i(A0P2.toString());
                    } else {
                        if (A0z.containsKey("android.intent.extra.STREAM") && (parcelable = A0z.getParcelable("android.intent.extra.STREAM")) != null) {
                            Uri parse = Uri.parse(parcelable.toString());
                            if (parse != null) {
                                StringBuilder A0P3 = C000200d.A0P("contactpicker/share/stream/");
                                A0P3.append(parse.toString());
                                Log.i(A0P3.toString());
                                try {
                                    A02 = this.A1H.A02(parse);
                                } catch (IOException unused2) {
                                    this.A0F.A07(R.string.vcard_format_unsupport, 0);
                                    this.A0a.A00();
                                    return;
                                }
                            } else {
                                StringBuilder A0P4 = C000200d.A0P("contactpicker/share/stream/vcard uri is not valid. ");
                                A0P4.append(parcelable.toString());
                                Log.i(A0P4.toString());
                            }
                        }
                        Log.w("contact_picker/share intent does not reference VCard data");
                        this.A0F.A07(R.string.share_failed, 0);
                        this.A0a.A00();
                        return;
                    }
                    try {
                        C43321xD A012 = this.A1H.A01(A02);
                        ArrayList arrayList = A012.A01;
                        if (arrayList.size() > 1) {
                            this.A1V = arrayList;
                            hashSet.add(14);
                            this.A00 = (byte) 14;
                        } else {
                            this.A1Q = (String) arrayList.get(0);
                            this.A1R = A012.A00;
                            hashSet.add(4);
                            this.A00 = (byte) 4;
                        }
                    } catch (C43301xB e) {
                        this.A1H.A03(e);
                        this.A0a.A00();
                        return;
                    }
                } else {
                    ArrayList parcelableArrayList = A0z.getParcelableArrayList("android.intent.extra.STREAM");
                    this.A1U = parcelableArrayList;
                    if (parcelableArrayList == null) {
                        Parcelable parcelable2 = A0z.getParcelable("android.intent.extra.STREAM");
                        StringBuilder sb = new StringBuilder();
                        sb.append("contactpicker/share/uri ");
                        sb.append(parcelable2);
                        Log.i(sb.toString());
                        if (parcelable2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            this.A1U = arrayList2;
                            arrayList2.add(parcelable2);
                        }
                    } else {
                        C000200d.A1W(parcelableArrayList, C000200d.A0P("contactpicker/share/uris "));
                        Iterator it = this.A1U.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("contactpicker/share/uri ");
                            sb2.append(next);
                            Log.i(sb2.toString());
                        }
                    }
                    ArrayList arrayList3 = this.A1U;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Uri uri2 = (Uri) it2.next();
                            File A05 = AnonymousClass024.A05(uri2);
                            if (A05 != null) {
                                try {
                                    this.A1E.A06(A05);
                                } catch (IOException e2) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("contactpicker/shared-internal-file ");
                                    sb3.append(uri2);
                                    Log.e(sb3.toString(), e2);
                                    this.A0F.A07(R.string.share_file_format_unsupport, 0);
                                    this.A1U = null;
                                    this.A0a.A00();
                                    return;
                                }
                            }
                            byte A0X = this.A1F.A0X(uri2);
                            if (A0X != -1) {
                                if (MediaProvider.A01().match(uri2) == 4 && !A09().getPackageName().equals(A09().getCallingPackage())) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("contactpicker/shared-internal-file ");
                                    sb4.append(uri2);
                                    Log.e(sb4.toString());
                                    this.A1U = null;
                                    this.A0a.A00();
                                    return;
                                }
                                hashSet.add(Integer.valueOf(A0X));
                            } else {
                                StringBuilder sb5 = new StringBuilder("contactpicker/share/unsupported ");
                                sb5.append(uri2);
                                sb5.append(" ");
                                sb5.append(C0DD.A0K(this.A0m.A07(), uri2));
                                sb5.append(" ");
                                sb5.append(C0DD.A0L(uri2));
                                Log.e(sb5.toString());
                                this.A0F.A07(R.string.share_file_format_unsupport, 0);
                                this.A1U = null;
                                this.A0a.A00();
                                return;
                            }
                        }
                        if ((hashSet.contains(1) || hashSet.contains(3) || hashSet.contains(13) || A1b()) && !A0z.getBoolean("skip_preview", false)) {
                            this.A09.setImageDrawable(new C0We(this.A0p, C02160Ac.A03(A0a(), R.drawable.ic_action_arrow_next)));
                        } else {
                            this.A09.setImageDrawable(new C0We(this.A0p, C02160Ac.A03(A0a(), R.drawable.input_send)));
                        }
                        ArrayList arrayList4 = this.A1U;
                        if (arrayList4.size() > 30) {
                            this.A0F.A0E(C42041uv.A04(A0a(), 30), 0);
                            this.A1U = null;
                            this.A0a.A00();
                            return;
                        }
                        Context A0a = A0a();
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            try {
                                A0a.grantUriPermission("com.whatsapp", (Uri) it3.next(), 1);
                            } catch (SecurityException e3) {
                                Log.w("contactpicker/permission ", e3);
                            }
                        }
                    } else {
                        StringBuilder A0P5 = C000200d.A0P("contactpicker/share_uris/null ");
                        A0P5.append(A0z.toString());
                        A1O(A0P5.toString(), R.string.share_failed);
                        return;
                    }
                }
            } else {
                String string3 = A0z.getString("android.intent.extra.TEXT");
                if (string3 != null) {
                    byte[] bytes = string3.getBytes();
                    if (bytes.length > 4096) {
                        string3 = new String(bytes, 0, 4096);
                    }
                    this.A1P = C000200d.A0L(new StringBuilder(), this.A1P, string3);
                }
                if (!AnonymousClass029.A1R(this.A0m, this.A16, this.A1P)) {
                    A1O("contactpicker/share_text/empty", R.string.cannot_send_empty_text_message);
                    return;
                }
                C1Lh.A01(this.A0F, this.A1G, this.A0K, this.A0p, C04310Jr.A01(this.A1P), null);
                this.A1a = false;
                hashSet.add(0);
            }
        } else {
            this.A1n = true;
        }
        this.A1f = this.A0z.A0C(462);
        int i = this.A01;
        if (i == 0) {
            View view = this.A05;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (this.A05 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(R.id.frequently_forwarded_holder);
            this.A05 = A04().inflate(R.layout.frequently_forwarded_info, viewGroup, true);
            int i2 = R.string.frequently_forwarded_picker_info_multiple_messages;
            if (i == 1) {
                i2 = R.string.frequently_forwarded_picker_info_single_message;
            }
            Spanned fromHtml = Html.fromHtml(A0F(i2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    if ("learn-more".equals(uRLSpan.getURL())) {
                        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                        spannableStringBuilder.removeSpan(uRLSpan);
                        spannableStringBuilder.setSpan(new AbstractC02750Cs(this.A07.getContext()) { // from class: X.3J7
                            {
                                ContactPickerFragment.this = this;
                            }

                            @Override // X.InterfaceC02760Ct
                            public void onClick(View view2) {
                                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                                contactPickerFragment.A0D.A06(contactPickerFragment.A0a(), new Intent("android.intent.action.VIEW", contactPickerFragment.A1A.A03("general", "26000253", null)));
                            }
                        }, spanStart, spanEnd, spanFlags);
                    }
                }
            }
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A05.findViewById(R.id.info_text);
            textEmojiLabel.A07 = new C02770Cu();
            textEmojiLabel.setAccessibilityHelper(new C02780Cv(this.A0m, textEmojiLabel));
            textEmojiLabel.setText(spannableStringBuilder);
            this.A05.setVisibility(0);
            viewGroup.setVisibility(0);
        }
        AbstractC005302j A023 = AbstractC005302j.A02(A0z.getString("jid"));
        if (A023 != null && (A09 = this.A0S.A09(A023)) != null) {
            A1c(A09, null);
        }
        if (A0z.containsKey("contacts_to_exclude")) {
            this.A1x.addAll(C003101m.A0F(AbstractC005302j.class, A0z.getStringArrayList("contacts_to_exclude")));
        }
        if (this.A1e) {
            this.A1e = false;
            A19();
        } else {
            A18();
        }
        A14();
        C0GA c0ga = new C0GA() { // from class: X.36Y
            {
                ContactPickerFragment.this = this;
            }

            @Override // X.C0GA
            public void A00() {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                if (contactPickerFragment != null) {
                    if (!ContactPickerFragment.A1z) {
                        contactPickerFragment.A18();
                        return;
                    }
                    return;
                }
                throw null;
            }

            @Override // X.C0GA
            public void A01(AbstractC005302j abstractC005302j) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                if (C06C.A00(contactPickerFragment.A1W, new C3AD(contactPickerFragment.A0S.A0A(abstractC005302j)))) {
                    contactPickerFragment.A0b.notifyDataSetChanged();
                }
            }

            @Override // X.C0GA
            public void A03(UserJid userJid) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                if (C06C.A00(contactPickerFragment.A1W, new C3AC(contactPickerFragment.A0S.A0A(userJid)))) {
                    contactPickerFragment.A0b.notifyDataSetChanged();
                }
            }

            @Override // X.C0GA
            public void A04(UserJid userJid) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                if (C06C.A00(contactPickerFragment.A1W, new C3AE(contactPickerFragment.A0S.A0A(userJid)))) {
                    contactPickerFragment.A0b.notifyDataSetChanged();
                }
            }

            @Override // X.C0GA
            public void A05(Collection collection) {
                ContactPickerFragment.this.A0b.notifyDataSetChanged();
            }
        };
        this.A0T = c0ga;
        this.A0U.A01(c0ga);
        C0GC c0gc = new C0GC() { // from class: X.36Z
            {
                ContactPickerFragment.this = this;
            }

            @Override // X.C0GC
            public void A00(AbstractC005302j abstractC005302j) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                if (contactPickerFragment != null) {
                    if (!ContactPickerFragment.A1z) {
                        contactPickerFragment.A18();
                        return;
                    }
                    return;
                }
                throw null;
            }
        };
        this.A0Q = c0gc;
        this.A0R.A01(c0gc);
        C0O4 c0o4 = new C0O4() { // from class: X.36a
            {
                ContactPickerFragment.this = this;
            }

            @Override // X.C0O4
            public void A00() {
                ContactPickerFragment.this.A0a.A00.A0m(true);
            }

            @Override // X.C0O4
            public void A01(boolean z) {
                ContactPickerFragment.this.A0a.A00.A0m(false);
            }
        };
        this.A0i = c0o4;
        this.A0j.A01(c0o4);
        C0GE c0ge = new C0GE() { // from class: X.36b
            {
                ContactPickerFragment.this = this;
            }

            @Override // X.C0GE
            public void A00(Set set) {
                ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                if (contactPickerFragment != null) {
                    if (!ContactPickerFragment.A1z) {
                        contactPickerFragment.A18();
                        return;
                    }
                    return;
                }
                throw null;
            }
        };
        this.A12 = c0ge;
        this.A13.A01(c0ge);
    }

    public void A16() {
        this.A0I.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r42.A1b != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0HS, X.36i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A17() {
        /*
            r42 = this;
            r13 = r42
            X.36i r1 = r13.A0e
            r0 = 1
            if (r1 == 0) goto Ld
            r1.A05(r0)
            r0 = 0
            r13.A0e = r0
        Ld:
            java.lang.String r0 = r13.A1M
            r16 = r0
            java.util.ArrayList r0 = r13.A1T
            r17 = r0
            java.util.List r0 = r13.A1W
            r18 = r0
            java.util.List r0 = r13.A1Z
            r19 = r0
            java.util.List r0 = r13.A1X
            r20 = r0
            java.util.List r0 = r13.A1Y
            r21 = r0
            java.util.HashSet r0 = r13.A1u
            r22 = r0
            X.02j r0 = r13.A14
            r23 = r0
            java.util.Set r0 = r13.A1x
            r24 = r0
            boolean r0 = r13.A1j
            r25 = r0
            boolean r0 = r13.A1r
            r26 = r0
            boolean r15 = r13.A1i
            boolean r12 = r13.A1l
            boolean r11 = r13.A1q
            boolean r10 = r13.A1h
            boolean r9 = r13.A1k
            boolean r8 = r13.A1n
            boolean r7 = r13.A1p
            boolean r6 = r13.A1m
            int r0 = r13.A01
            if (r0 > 0) goto L53
            boolean r0 = r13.A1b
            r35 = 0
            if (r0 == 0) goto L55
        L53:
            r35 = 1
        L55:
            X.05M r5 = r13.A0q
            X.05W r4 = r13.A0S
            X.08s r3 = r13.A0X
            X.01c r2 = r13.A0p
            X.0CB r1 = r13.A17
            X.0CA r0 = r13.A0r
            r28 = r12
            r29 = r11
            r30 = r10
            r31 = r9
            r32 = r8
            r33 = r7
            r34 = r6
            r36 = r5
            r37 = r4
            r38 = r3
            r39 = r2
            r40 = r1
            r41 = r0
            r27 = r15
            r15 = r13
            X.36i r14 = new X.36i
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r13.A0e = r14
            X.01k r1 = r13.A1G
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.AS4(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A17():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0HS, X.36m] */
    public final void A18() {
        C652536m c652536m = this.A0f;
        if (c652536m != null) {
            c652536m.A05(true);
        }
        C652136i c652136i = this.A0e;
        if (c652136i != null) {
            c652136i.A05(true);
            this.A0e = null;
        }
        ?? r2 = new C0HS(this, this.A1u, this.A14, this.A1j, this.A1g, this.A1r, this.A1i, this.A1l, this.A1q, this.A1h, this.A1k, this.A1n, this.A1p, this.A1o, this.A1b, this.A0S, this.A0P, this.A0O, this.A0s, this.A0t) { // from class: X.36m
            public final C0L8 A00;
            public final C40261rr A01;
            public final C05W A02;
            public final C03730Gv A03;
            public final C0C8 A04;
            public final AbstractC005302j A05;
            public final WeakReference A06;
            public final HashSet A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;
            public final boolean A0C;
            public final boolean A0D;
            public final boolean A0E;
            public final boolean A0F;
            public final boolean A0G;
            public final boolean A0H;
            public final boolean A0I;
            public final boolean A0J;

            {
                this.A06 = new WeakReference(this);
                this.A07 = r3;
                this.A05 = r4;
                this.A0C = r5;
                this.A09 = r6;
                this.A0J = r7;
                this.A0B = r8;
                this.A0E = r9;
                this.A0I = r10;
                this.A0A = r11;
                this.A0D = r12;
                this.A0F = r13;
                this.A0H = r14;
                this.A0G = r15;
                this.A08 = r16;
                this.A02 = r17;
                this.A01 = r18;
                this.A00 = r19;
                this.A03 = r20;
                this.A04 = r21;
            }

            @Override // X.C0HS
            public void A03(Object[] objArr) {
                C57952qL[] c57952qLArr = (C57952qL[]) objArr;
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A06.get();
                if (contactPickerFragment == null || !contactPickerFragment.A0W()) {
                    return;
                }
                contactPickerFragment.A1K(c57952qLArr[0]);
            }

            /* JADX WARN: Code restructure failed: missing block: B:137:0x005f, code lost:
                if (r10.contains(43) != false) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x0078, code lost:
                if (r10.contains(42) != false) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x01b1, code lost:
                if (r2.A01((X.AbstractC011205o) r0).A0B(r2.A01) != false) goto L59;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r13) {
                /*
                    Method dump skipped, instructions count: 456
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C652536m.A07(java.lang.Object[]):java.lang.Object");
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C57952qL c57952qL = (C57952qL) obj;
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A06.get();
                if (contactPickerFragment == null || !contactPickerFragment.A0W()) {
                    return;
                }
                ArrayList arrayList = c57952qL.A00;
                arrayList.size();
                c57952qL.A03.size();
                c57952qL.A01.size();
                contactPickerFragment.A0f = null;
                if (contactPickerFragment.A1X() && !arrayList.isEmpty()) {
                    contactPickerFragment.A11().A0G(contactPickerFragment.A0p.A0A(R.plurals.n_contacts, arrayList.size(), Integer.valueOf(arrayList.size())));
                }
                contactPickerFragment.A1K(c57952qL);
            }
        };
        this.A0f = r2;
        this.A1G.AS4(r2, new Void[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.36g, X.0HS] */
    public final void A19() {
        C02L c02l = this.A0G;
        c02l.A05();
        if (c02l.A00 == null) {
            this.A0F.A07(R.string.finish_registration_first, 1);
            return;
        }
        this.A0a.A00.A0m(true);
        C651936g c651936g = this.A0c;
        if (c651936g != null) {
            c651936g.A05(true);
        }
        ?? r2 = new C0HS(this, this.A0S, this.A0h, this.A0r) { // from class: X.36g
            public final C05W A00;
            public final C41321tj A01;
            public final C0CA A02;
            public final WeakReference A03;

            {
                this.A03 = new WeakReference(this);
                this.A00 = r3;
                this.A01 = r4;
                this.A02 = r5;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C468428m c468428m = new C468428m(C22H.A07);
                c468428m.A02();
                c468428m.A04 = true;
                return this.A01.A01(c468428m.A01());
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                EnumC40721sl enumC40721sl = (EnumC40721sl) obj;
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A03.get();
                if (contactPickerFragment != null && contactPickerFragment.A0W()) {
                    contactPickerFragment.A0a.A00.A0m(false);
                    contactPickerFragment.A18();
                    int ordinal = enumC40721sl.ordinal();
                    if (ordinal == 0) {
                        contactPickerFragment.A0a.AUj(R.string.coldsync_no_network);
                    } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        if (!contactPickerFragment.A0n.A03()) {
                            return;
                        }
                        contactPickerFragment.A0F.A07(R.string.coldsync_nochange_msg, 0);
                    } else if (ordinal != 4 && ordinal != 6) {
                    } else {
                        contactPickerFragment.A0a.AUj(R.string.coldsync_failed_msg);
                        C41321tj c41321tj = contactPickerFragment.A0h;
                        if (c41321tj != null) {
                            C468428m c468428m = new C468428m(C22H.A04);
                            c468428m.A02();
                            c468428m.A06 = true;
                            c41321tj.A02(c468428m.A01(), true);
                            return;
                        }
                        throw null;
                    }
                }
            }
        };
        this.A0c = r2;
        this.A1G.ARy(r2, new Void[0]);
    }

    public final void A1A() {
        String A08;
        Map map = this.A1w;
        ArrayList arrayList = new ArrayList(map.size());
        for (C06C c06c : map.values()) {
            if (C003101m.A0Z(c06c.A02())) {
                A08 = A0F(R.string.my_status);
            } else {
                A08 = this.A0X.A08(c06c, false);
            }
            if (A08 != null) {
                arrayList.add(0, A08);
            }
        }
        this.A0M.A03(AnonymousClass029.A0o(this.A0X.A04, false, arrayList));
        if (this.A0p.A0N()) {
            final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.A06.findViewById(R.id.recipients_scroller);
            horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.2qH
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    HorizontalScrollView horizontalScrollView2 = horizontalScrollView;
                    horizontalScrollView2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    horizontalScrollView2.fullScroll(66);
                }
            });
        }
        if (TextUtils.isEmpty(this.A1P)) {
            return;
        }
        this.A09.setImageDrawable(new C0We(this.A0p, C02160Ac.A03(A0a(), R.drawable.ic_action_arrow_next)));
    }

    public final void A1B() {
        if (this.A02 + 3500 < SystemClock.elapsedRealtime()) {
            this.A02 = SystemClock.elapsedRealtime();
            this.A0F.A0E(this.A0p.A0A(R.plurals.text_status_truncation_info, 700L, 700), 1);
        }
    }

    public final void A1C() {
        if (this.A03 + 3500 < SystemClock.elapsedRealtime()) {
            this.A03 = SystemClock.elapsedRealtime();
            this.A1B.A02();
        }
    }

    public final void A1D() {
        if (this.A0C != null) {
            Map map = this.A1w;
            if (map.isEmpty()) {
                this.A0C.A05();
            } else {
                this.A0C.A0B(this.A0p.A0G().format(map.size()));
            }
        }
    }

    public void A1E(int i) {
        Context A0a = A0a();
        if (A0a == null) {
            return;
        }
        if (i == R.string.directly_entered_number_not_whatsappable || i == R.string.directly_entered_number_invalid || i == R.string.directly_entered_number_sync_failed || i == R.string.directly_entered_number_not_checked || i == R.string.directly_entered_number_is_missing_country_code || i == R.string.directly_entered_number_invalid_length || i == R.string.directly_entered_number_invalid_length_without_country_name || i == R.string.directly_entered_number_too_long || i == R.string.directly_entered_number_too_long_without_country_name || i == R.string.directly_entered_number_too_short || i == R.string.directly_entered_number_too_short_without_country_name || i == R.string.directly_entered_number_too_short_without_country_code) {
            A0i(new Intent(A0a, Main.class));
            this.A0a.A00();
        }
    }

    public final void A1F(Intent intent) {
        String str = this.A1J;
        if (str == null || this.A1K == null) {
            return;
        }
        intent.putExtra("conversion_data", str);
        intent.putExtra("conversion_source", this.A1K);
    }

    public final void A1G(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        layoutParams.width = A01().getDimensionPixelSize(R.dimen.list_ui_refresh_contact_button_width);
        view.setLayoutParams(layoutParams);
    }

    public final void A1H(View view) {
        C0LX.A07(this.A0p, view, 0, 0, A01().getDimensionPixelSize(R.dimen.list_ui_refresh_contact_regular_ephemeral_selection_right_margin), ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin);
    }

    public final void A1I(View view, View view2) {
        C0LX.A08(this.A0p, view, 0, 0, A01().getDimensionPixelSize(R.dimen.list_ui_refresh_container_horizontal_padding), 0);
        C0LX.A08(this.A0p, view2, 0, 0, A1a() ? A01().getDimensionPixelSize(R.dimen.list_ui_refresh_contact_picker_row_text_padding_right) : 0, 0);
    }

    public void A1J(C57942qK c57942qK) {
        C54532iu c54532iu = this.A0b;
        c54532iu.A02 = c57942qK.A00;
        c54532iu.notifyDataSetChanged();
        List list = c57942qK.A01;
        int i = list == null ? 0 : 8;
        for (View view : this.A1v) {
            view.setVisibility(i);
        }
        if (this.A1n || this.A1h) {
            A1R(list == null);
        }
    }

    public void A1K(C57952qL c57952qL) {
        ArrayList arrayList = c57952qL.A00;
        this.A1W = arrayList;
        this.A1Z = c57952qL.A03;
        this.A1X = c57952qL.A01;
        this.A1Y = c57952qL.A02;
        MenuItem menuItem = this.A04;
        if (menuItem != null) {
            menuItem.setVisible(!arrayList.isEmpty());
        }
        A17();
    }

    public final void A1L(C06C c06c) {
        C0W5 c0w5 = this.A0L;
        Activity A00 = C018308n.A00(A0a());
        StringBuilder A0P = C000200d.A0P("sms:");
        A0P.append(C04630Le.A00(c06c));
        c0w5.A00(A00, Uri.parse(A0P.toString()), A0G(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/"), Integer.valueOf(this.A1h ? 15 : 14));
    }

    public final void A1M(C06C c06c) {
        Intent intent;
        Jid A03;
        if (this.A1U != null && !this.A0n.A06()) {
            C54552iw c54552iw = this.A0a;
            ActivityC02330At A0A = A0A();
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_sharing_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_sharing;
            }
            c54552iw.A00.A15(RequestPermissionActivity.A01(A0A, R.string.permission_storage_need_write_access_on_sharing_request, i2, false), 151);
            return;
        }
        Map map = this.A1w;
        if (map.size() == 1 && !C003101m.A0Z(((C06C) map.values().iterator().next()).A02())) {
            this.A0x = (C06C) map.values().iterator().next();
            map.clear();
        }
        this.A0a.A00.setResult(-1);
        if (this.A0x == null && c06c == null) {
            final ArrayList arrayList = new ArrayList(map.size());
            for (C06C c06c2 : map.values()) {
                arrayList.add(c06c2.A03(AbstractC005302j.class));
            }
            if (!TextUtils.isEmpty(this.A1P)) {
                if (map.size() == 1 && C003101m.A0Z(((C06C) map.values().iterator().next()).A02())) {
                    Intent intent2 = new Intent(A0a(), TextStatusComposerActivity.class);
                    intent2.putExtra("android.intent.extra.TEXT", this.A1P);
                    this.A0a.A00.A16(intent2, true);
                    return;
                }
                C54552iw c54552iw2 = this.A0a;
                String str = this.A1P;
                boolean z = this.A1d;
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = new SharedTextPreviewDialogFragment();
                BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = new BaseSharedPreviewDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("jids", C003101m.A0E(arrayList));
                baseSharedPreviewDialogFragment.A0P(bundle);
                Bundle A02 = baseSharedPreviewDialogFragment.A02();
                A02.putString("message", str);
                A02.putBoolean("has_text_from_url", z);
                sharedTextPreviewDialogFragment.A0P(A02);
                c54552iw2.AUg(sharedTextPreviewDialogFragment, null);
                return;
            }
            String str2 = this.A1Q;
            if (str2 != null) {
                this.A0N.A0f(arrayList, this.A1R, str2, null, false);
                this.A0a.A00.A1L(arrayList);
                if (map.size() > 1) {
                    this.A0a.A00.A14(HomeActivity.A01(A0A()));
                }
                this.A0a.A00();
                return;
            }
            ArrayList arrayList2 = this.A1V;
            if (arrayList2 != null) {
                this.A0N.A0h(arrayList, arrayList2, null, false);
                this.A0a.A00.A1L(arrayList);
                if (map.size() > 1) {
                    this.A0a.A00.A14(HomeActivity.A01(A0A()));
                }
                this.A0a.A00();
                return;
            }
            ArrayList arrayList3 = this.A1U;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                return;
            }
            if (A1b()) {
                A1Q(arrayList);
                return;
            }
            Bundle A0z = A0z();
            A0z.putString("mime_type", this.A1O);
            this.A0J.A09(true, arrayList, this.A1U, A0z.getString("android.intent.extra.TEXT"), A0z.getInt("origin", 0), A0z.getBoolean("skip_preview", false), A0A(), this.A0a, new InterfaceC05830Qk() { // from class: X.36V
                public final ArrayList A02 = new ArrayList();
                public final ArrayList A01 = new ArrayList();
                public boolean A00 = false;

                {
                    ContactPickerFragment.this = this;
                }

                public final void A00() {
                    ArrayList arrayList4 = this.A02;
                    int size = this.A01.size() + arrayList4.size();
                    ContactPickerFragment contactPickerFragment = ContactPickerFragment.this;
                    if (size == contactPickerFragment.A1U.size()) {
                        if (!arrayList4.isEmpty() && !this.A00) {
                            C54552iw c54552iw3 = contactPickerFragment.A0a;
                            c54552iw3.A00.A1L(arrayList);
                        }
                        contactPickerFragment.A0a.A00();
                    }
                }

                @Override // X.InterfaceC05830Qk
                public void AKC() {
                    this.A00 = true;
                }

                @Override // X.InterfaceC05830Qk
                public void AQB(Uri uri) {
                    this.A01.add(uri);
                    A00();
                }

                @Override // X.InterfaceC05830Qk
                public void AQC(Uri uri) {
                    this.A02.add(uri);
                    A00();
                }
            });
        } else if (A1b()) {
            C06C c06c3 = this.A0x;
            if (c06c3 != null) {
                A03 = c06c3.A03(AbstractC005302j.class);
            } else {
                A03 = c06c.A03(AbstractC005302j.class);
            }
            A1Q(Collections.singletonList(A03));
        } else {
            C06C c06c4 = this.A0x;
            if (c06c4 == null) {
                c06c4 = c06c;
            }
            boolean z2 = c06c != null;
            Jid A022 = c06c4.A02();
            C000700j.A07(!C003101m.A0Z(A022));
            if (this.A1U == null) {
                if (A1d(UserJid.of(A022))) {
                    Context A00 = A00();
                    boolean z3 = !this.A1a;
                    boolean z4 = this.A1d;
                    byte b = this.A00;
                    Jid A032 = c06c4.A03(AbstractC005302j.class);
                    if (A032 != null) {
                        intent = Conversation.A05(A00, z3, z4, b, (AbstractC005302j) A032, z2, this.A1L, this.A1N, this.A1S);
                        A1F(intent);
                    } else {
                        throw null;
                    }
                } else if (!TextUtils.isEmpty(this.A1P)) {
                    Context A002 = A00();
                    boolean z5 = !this.A1a;
                    boolean z6 = this.A1d;
                    String str3 = this.A1P;
                    byte b2 = this.A00;
                    Jid A033 = c06c4.A03(AbstractC005302j.class);
                    if (A033 != null) {
                        intent = Conversation.A0E(A002, z5, z6, str3, b2, (AbstractC005302j) A033, z2);
                        A1F(intent);
                    } else {
                        throw null;
                    }
                } else if (this.A1Q != null) {
                    intent = new Intent(A0a(), Conversation.class);
                    Jid A023 = c06c4.A02();
                    if (A023 != null) {
                        intent.putExtra("jid", A023.getRawString());
                        intent.putExtra("vcard_str", this.A1Q);
                        intent.putExtra("vcard_name", this.A1R);
                        intent.putExtra("wa_type", this.A00);
                        intent.putExtra("has_share", true);
                        intent.addFlags(335544320);
                    } else {
                        throw null;
                    }
                } else if (this.A1V == null) {
                    return;
                } else {
                    intent = new Intent(A0a(), Conversation.class);
                    Jid A024 = c06c4.A02();
                    if (A024 != null) {
                        intent.putExtra("jid", A024.getRawString());
                        intent.putStringArrayListExtra("vcard_array_str", this.A1V);
                        intent.putExtra("wa_type", this.A00);
                        intent.putExtra("has_share", true);
                        intent.addFlags(335544320);
                    } else {
                        throw null;
                    }
                }
                if (intent == null) {
                    return;
                }
            } else {
                Bundle A0z2 = A0z();
                intent = new Intent(A0a(), Conversation.class);
                Jid A025 = c06c4.A02();
                if (A025 != null) {
                    intent.putExtra("jid", A025.getRawString());
                    intent.putExtra("wa_type", this.A00);
                    intent.putExtra("has_share", true);
                    A1F(intent);
                    intent.putExtra("skip_preview", A0z2.getBoolean("skip_preview", false));
                    intent.putExtra("origin", A0z2.getInt("origin", 0));
                    intent.putExtra("android.intent.extra.TEXT", A0z2.getString("android.intent.extra.TEXT"));
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.A1U);
                    intent.addFlags(335544320);
                } else {
                    throw null;
                }
            }
            Conversation.A0L(A0a(), intent);
            C002701i.A1C(intent, "ContactPickerFragment:shareIntent", ((WaFragment) this).A00.A00);
            this.A0a.A00.A16(intent, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1N(X.C06C r25, android.view.View r26) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A1N(X.06C, android.view.View):void");
    }

    public final void A1O(String str, int i) {
        Log.e(str);
        C018508q c018508q = this.A0F;
        c018508q.A0E(c018508q.A04.A00.getString(i), 0);
        this.A0a.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0051, code lost:
        if (r1 == 1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.36h, X.0HS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1P(java.lang.String r21, boolean r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A1P(java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    public final void A1Q(List list) {
        if (A1b()) {
            Bundle A0z = A0z();
            A0z.putString("mime_type", this.A1O);
            Object obj = this.A1U.get(0);
            SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment = new SharedFilePreviewDialogFragment();
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = new BaseSharedPreviewDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("jids", C003101m.A0E(list));
            baseSharedPreviewDialogFragment.A0P(bundle);
            Bundle A02 = baseSharedPreviewDialogFragment.A02();
            A02.putString("share_uri", obj.toString());
            A02.putBundle("extras", A0z);
            sharedFilePreviewDialogFragment.A0P(A02);
            sharedFilePreviewDialogFragment.A14(A09().A0N(), null);
        }
    }

    public final void A1R(boolean z) {
        ListView listView = this.A0A;
        if (listView == null) {
            return;
        }
        listView.setFastScrollEnabled(z);
        this.A0A.setFastScrollAlwaysVisible(z);
        if (z) {
            this.A0A.setScrollBarStyle(33554432);
        } else {
            this.A0A.setScrollBarStyle(0);
        }
    }

    public boolean A1T() {
        return this.A1n || this.A1h;
    }

    public boolean A1U() {
        return this.A1n;
    }

    public boolean A1V() {
        return this.A1n || this.A1h;
    }

    public boolean A1W() {
        return this.A1n || this.A1h;
    }

    public boolean A1X() {
        return this.A1g || this.A1h || this.A1n || this.A1k;
    }

    public boolean A1Y() {
        if (this.A0I.A05()) {
            this.A0I.A04(true);
            return true;
        } else if (this.A1l) {
            this.A10.A08(true, this.A1w.size());
            return false;
        } else {
            return false;
        }
    }

    public boolean A1Z() {
        return this.A1g || this.A1q || this.A1h || this.A1n || this.A1k;
    }

    public boolean A1a() {
        return this.A1n || this.A1h || this.A1g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0020, code lost:
        if (r1 == 13) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1b() {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A1U
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L40
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L40
            X.1un r1 = r5.A1F
            java.lang.Object r0 = r4.get(r2)
            android.net.Uri r0 = (android.net.Uri) r0
            byte r1 = r1.A0X(r0)
            if (r1 == r3) goto L22
            r0 = 3
            if (r1 == r0) goto L22
            r0 = 13
            r2 = 1
            if (r1 != r0) goto L23
        L22:
            r2 = 0
        L23:
            X.01B r1 = r5.A0K
            X.03B r0 = X.C01C.A1e
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L3e
            X.0At r0 = r5.A09()
            if (r0 == 0) goto L3e
            java.util.ArrayList r0 = r5.A1U
            int r0 = r0.size()
            if (r0 != r3) goto L3e
            if (r2 == 0) goto L3e
            return r3
        L3e:
            r3 = 0
            return r3
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.ContactPickerFragment.A1b():boolean");
    }

    public boolean A1c(C06C c06c, Intent intent) {
        StringBuilder A0P = C000200d.A0P("contactpicker/picked ");
        A0P.append(c06c.A02());
        Log.i(A0P.toString());
        if (this.A0P.A0H((UserJid) c06c.A03(UserJid.class))) {
            return true;
        }
        this.A0x = c06c;
        if ((this.A1r || this.A1l || this.A1p || this.A1q) && c06c.A0C()) {
            C0C8 c0c8 = this.A0t;
            Jid A03 = c06c.A03(GroupJid.class);
            if (A03 != null) {
                if (!c0c8.A01((AbstractC011205o) A03).A0B(c0c8.A01)) {
                    return true;
                }
            } else {
                throw null;
            }
        }
        if (this.A1i) {
            C0L8 c0l8 = this.A0O;
            this.A0a.A01(C0M7.A00(c0l8.A07.A00, c0l8.A01(c06c, true, true)));
            this.A0a.A00();
        } else if (this.A1r) {
            if (this.A1U != null) {
                if (!A0z().getBoolean("skip_preview", false)) {
                    Iterator it = this.A1U.iterator();
                    while (it.hasNext()) {
                        if (this.A1F.A0X((Uri) it.next()) != 1) {
                            C002701i.A19(A09(), 1);
                            return true;
                        }
                    }
                    A1M(null);
                    return true;
                }
                C002701i.A19(A09(), 1);
                return true;
            }
            String str = this.A1P;
            if (str != null && str.length() > 0) {
                if (this.A1a) {
                    C002701i.A19(A09(), 1);
                    return true;
                }
                A1M(null);
                return true;
            } else if (this.A1Q != null) {
                C002701i.A19(A09(), 1);
                return true;
            } else if (this.A1V != null) {
                C002701i.A19(A09(), 1);
                return true;
            }
        } else if (this.A1l) {
            C002701i.A19(A09(), 2);
            return true;
        } else if (this.A1q) {
            C002701i.A19(A09(), 3);
            return true;
        } else if (this.A1k) {
            Jid A032 = c06c.A03(UserJid.class);
            if (A032 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("peer_id", A032.getRawString());
                InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment = new InviteToGroupCallConfirmationFragment();
                inviteToGroupCallConfirmationFragment.A0P(bundle);
                AbstractC02800Cx A0B = A0B();
                if (A0B != null) {
                    C02820Cz c02820Cz = new C02820Cz(A0B);
                    c02820Cz.A09(0, inviteToGroupCallConfirmationFragment, "InviteParticipantConfirmationDialog", 1);
                    c02820Cz.A05();
                    return true;
                }
                throw null;
            }
            throw null;
        } else {
            if (!this.A1h || intent == null) {
                intent = new Intent();
            }
            Jid A02 = c06c.A02();
            if (A02 != null) {
                intent.putExtra("contact", A02.getRawString());
                this.A0a.A01(intent);
                this.A0a.A00();
                return true;
            }
            throw null;
        }
        return true;
    }

    public final boolean A1d(UserJid userJid) {
        return userJid != null && (!this.A0W.A02(userJid) || this.A0K.A0E(C01C.A0c)) && this.A0K.A0E(C01C.A0b) && !TextUtils.isEmpty(this.A1L) && !TextUtils.isEmpty(this.A1S);
    }

    @Override // X.C0BA, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C06C A93;
        InterfaceC54742jH interfaceC54742jH = (InterfaceC54742jH) ((AdapterView) view).getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        if (interfaceC54742jH == null || (A93 = interfaceC54742jH.A93()) == null || !this.A0P.A0H((UserJid) A93.A03(UserJid.class))) {
            return;
        }
        contextMenu.add(0, 0, 0, A0G(R.string.block_list_menu_unblock, this.A0X.A08(A93, false)));
        A0A().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }
}
