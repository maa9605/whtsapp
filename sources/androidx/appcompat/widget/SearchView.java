package androidx.appcompat.widget;

import X.AbstractC13390lB;
import X.C07O;
import X.C0UY;
import X.C0V9;
import X.C11410hi;
import X.C11460hn;
import X.C1MB;
import X.C1S9;
import X.C1SM;
import X.C1TS;
import X.InterfaceC07620Za;
import X.InterfaceC07650Zd;
import X.InterfaceC11420hj;
import X.InterfaceC11430hk;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC07620Za {
    public static final C11410hi A0o = new C11410hi();
    public int A00;
    public int A01;
    public SearchableInfo A02;
    public Rect A03;
    public Rect A04;
    public Bundle A05;
    public TextWatcher A06;
    public View.OnClickListener A07;
    public View.OnFocusChangeListener A08;
    public View.OnKeyListener A09;
    public InterfaceC11420hj A0A;
    public InterfaceC07650Zd A0B;
    public InterfaceC11430hk A0C;
    public C11460hn A0D;
    public C1TS A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Runnable A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public int[] A0Q;
    public int[] A0R;
    public final int A0S;
    public final int A0T;
    public final Intent A0U;
    public final Intent A0V;
    public final Drawable A0W;
    public final View.OnClickListener A0X;
    public final View A0Y;
    public final View A0Z;
    public final View A0a;
    public final View A0b;
    public final AdapterView.OnItemClickListener A0c;
    public final AdapterView.OnItemSelectedListener A0d;
    public final ImageView A0e;
    public final ImageView A0f;
    public final ImageView A0g;
    public final ImageView A0h;
    public final ImageView A0i;
    public final TextView.OnEditorActionListener A0j;
    public final SearchAutoComplete A0k;
    public final CharSequence A0l;
    public final Runnable A0m;
    public final WeakHashMap A0n;

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new Rect();
        this.A04 = new Rect();
        this.A0Q = new int[2];
        this.A0R = new int[2];
        this.A0m = new Runnable() { // from class: X.0hZ
            {
                SearchView.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchView.this.A0A();
            }
        };
        this.A0I = new Runnable() { // from class: X.0ha
            {
                SearchView.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1TS c1ts = SearchView.this.A0E;
                if (c1ts instanceof C1MB) {
                    c1ts.A62(null);
                }
            }
        };
        this.A0n = new WeakHashMap();
        this.A0X = new View.OnClickListener() { // from class: X.0hd
            {
                SearchView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str;
                String str2;
                String str3;
                String flattenToShortString;
                SearchView searchView = SearchView.this;
                if (view == searchView.A0h) {
                    searchView.A0J(false);
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
                    searchAutoComplete.requestFocus();
                    searchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = searchView.A07;
                    if (onClickListener != null) {
                        onClickListener.onClick(searchView);
                    }
                } else if (view == searchView.A0e) {
                    searchView.A08();
                } else if (view == searchView.A0g) {
                    searchView.A09();
                } else if (view == searchView.A0i) {
                    SearchableInfo searchableInfo = searchView.A02;
                    if (searchableInfo == null) {
                        return;
                    }
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.A0V);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        } else {
                            Intent intent2 = searchView.A0U;
                            ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                            Intent intent3 = new Intent("android.intent.action.SEARCH");
                            intent3.setComponent(searchActivity2);
                            PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                            Bundle bundle = new Bundle();
                            Bundle bundle2 = searchView.A05;
                            if (bundle2 != null) {
                                bundle.putParcelable("app_data", bundle2);
                            }
                            Intent intent4 = new Intent(intent2);
                            Resources resources = searchView.getResources();
                            if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                str = resources.getString(searchableInfo.getVoiceLanguageModeId());
                            } else {
                                str = "free_form";
                            }
                            if (searchableInfo.getVoicePromptTextId() != 0) {
                                str2 = resources.getString(searchableInfo.getVoicePromptTextId());
                            } else {
                                str2 = null;
                            }
                            if (searchableInfo.getVoiceLanguageId() != 0) {
                                str3 = resources.getString(searchableInfo.getVoiceLanguageId());
                            } else {
                                str3 = null;
                            }
                            int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
                            intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
                            intent4.putExtra("android.speech.extra.PROMPT", str2);
                            intent4.putExtra("android.speech.extra.LANGUAGE", str3);
                            intent4.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
                            intent4.putExtra("calling_package", searchActivity2 != null ? searchActivity2.flattenToShortString() : null);
                            intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                            intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                            searchView.getContext().startActivity(intent4);
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                } else if (view != searchView.A0k) {
                } else {
                    searchView.A07();
                }
            }
        };
        this.A09 = new View.OnKeyListener() { // from class: X.0he
            {
                SearchView.this = this;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                int i3;
                SearchView searchView = SearchView.this;
                if (searchView.A02 == null) {
                    return false;
                }
                SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
                if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                    if (searchView.A02 != null && searchView.A0E != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                        if (i2 != 66 && i2 != 84 && i2 != 61) {
                            if (i2 == 21) {
                                i3 = 0;
                            } else if (i2 != 22) {
                                return (i2 == 19 && searchAutoComplete.getListSelection() == 0) ? false : false;
                            } else {
                                i3 = searchAutoComplete.length();
                            }
                            searchAutoComplete.setSelection(i3);
                            searchAutoComplete.setListSelection(0);
                            searchAutoComplete.clearListSelection();
                            Method method = SearchView.A0o.A02;
                            if (method != null) {
                                try {
                                    method.invoke(searchAutoComplete, Boolean.TRUE);
                                    return true;
                                } catch (Exception unused) {
                                    return true;
                                }
                            }
                            return true;
                        }
                        searchView.A0E(searchAutoComplete.getListSelection());
                        return true;
                    }
                    return false;
                } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.A06("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                } else {
                    return false;
                }
            }
        };
        this.A0j = new TextView.OnEditorActionListener() { // from class: X.0hf
            {
                SearchView.this = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.A09();
                return true;
            }
        };
        this.A0c = new AdapterView.OnItemClickListener() { // from class: X.0hg
            {
                SearchView.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                SearchView.this.A0E(i2);
            }
        };
        this.A0d = new AdapterView.OnItemSelectedListener() { // from class: X.0hh
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView) {
            }

            {
                SearchView.this = this;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView, View view, int i2, long j) {
                SearchView.this.A0F(i2);
            }
        };
        this.A06 = new TextWatcher() { // from class: X.0hY
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            {
                SearchView.this = this;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView searchView = SearchView.this;
                Editable text = searchView.A0k.getText();
                searchView.A0H = text;
                boolean z = !TextUtils.isEmpty(text);
                searchView.A0I(z);
                boolean z2 = !z;
                int i5 = 8;
                if (searchView.A0P && !searchView.A0K() && z2) {
                    searchView.A0g.setVisibility(8);
                    i5 = 0;
                }
                searchView.A0i.setVisibility(i5);
                searchView.A0B();
                searchView.A0D();
                if (searchView.A0B != null && !TextUtils.equals(charSequence, searchView.A0F)) {
                    searchView.A0B.ANX(charSequence.toString());
                }
                searchView.A0F = charSequence.toString();
            }
        };
        C0V9 c0v9 = new C0V9(context, context.obtainStyledAttributes(attributeSet, C0UY.A0W, i, 0));
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray typedArray = c0v9.A02;
        from.inflate(typedArray.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.A0k = searchAutoComplete;
        searchAutoComplete.A01 = this;
        this.A0Z = findViewById(R.id.search_edit_frame);
        this.A0a = findViewById(R.id.search_plate);
        this.A0b = findViewById(R.id.submit_area);
        this.A0h = (ImageView) findViewById(R.id.search_button);
        this.A0g = (ImageView) findViewById(R.id.search_go_btn);
        this.A0e = (ImageView) findViewById(R.id.search_close_btn);
        this.A0i = (ImageView) findViewById(R.id.search_voice_btn);
        this.A0f = (ImageView) findViewById(R.id.search_mag_icon);
        this.A0a.setBackground(c0v9.A02(10));
        this.A0b.setBackground(c0v9.A02(14));
        this.A0h.setImageDrawable(c0v9.A02(13));
        this.A0g.setImageDrawable(c0v9.A02(7));
        this.A0e.setImageDrawable(c0v9.A02(4));
        this.A0i.setImageDrawable(c0v9.A02(16));
        this.A0f.setImageDrawable(c0v9.A02(13));
        this.A0W = c0v9.A02(12);
        C07O.A0c(this.A0h, getResources().getString(R.string.abc_searchview_description_search));
        this.A0T = typedArray.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.A0S = typedArray.getResourceId(5, 0);
        this.A0h.setOnClickListener(this.A0X);
        this.A0e.setOnClickListener(this.A0X);
        this.A0g.setOnClickListener(this.A0X);
        this.A0i.setOnClickListener(this.A0X);
        this.A0k.setOnClickListener(this.A0X);
        this.A0k.addTextChangedListener(this.A06);
        this.A0k.setOnEditorActionListener(this.A0j);
        this.A0k.setOnItemClickListener(this.A0c);
        this.A0k.setOnItemSelectedListener(this.A0d);
        this.A0k.setOnKeyListener(this.A09);
        this.A0k.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0hb
            {
                SearchView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                SearchView searchView = SearchView.this;
                View.OnFocusChangeListener onFocusChangeListener = searchView.A08;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z);
                }
            }
        });
        setIconifiedByDefault(typedArray.getBoolean(8, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.A0l = typedArray.getText(6);
        this.A0G = typedArray.getText(11);
        int i2 = typedArray.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArray.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArray.getBoolean(0, true));
        typedArray.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.A0V = intent;
        intent.addFlags(268435456);
        this.A0V.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.A0U = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.A0k.getDropDownAnchor());
        this.A0Y = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0hc
                {
                    SearchView.this = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    int i12;
                    int i13;
                    SearchView searchView = SearchView.this;
                    View view2 = searchView.A0Y;
                    if (view2.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.A0a.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean A01 = C0Ux.A01(searchView);
                        if (searchView.A0M) {
                            i12 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                        } else {
                            i12 = 0;
                        }
                        SearchView.SearchAutoComplete searchAutoComplete2 = searchView.A0k;
                        searchAutoComplete2.getDropDownBackground().getPadding(rect);
                        if (A01) {
                            i13 = -rect.left;
                        } else {
                            i13 = paddingLeft - (rect.left + i12);
                        }
                        searchAutoComplete2.setDropDownHorizontalOffset(i13);
                        searchAutoComplete2.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i12) - paddingLeft);
                    }
                }
            });
        }
        A0J(this.A0M);
        A0C();
    }

    public final Intent A06(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.A0H);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.A05;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.A02.getSearchActivity());
        return intent;
    }

    public void A07() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.A0k.refreshAutoCompleteResults();
            return;
        }
        C11410hi c11410hi = A0o;
        SearchAutoComplete searchAutoComplete = this.A0k;
        Method method = c11410hi.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        Method method2 = c11410hi.A00;
        if (method2 == null) {
            return;
        }
        try {
            method2.invoke(searchAutoComplete, new Object[0]);
        } catch (Exception unused2) {
        }
    }

    public void A08() {
        SearchAutoComplete searchAutoComplete = this.A0k;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.A0M) {
                InterfaceC11420hj interfaceC11420hj = this.A0A;
                if (interfaceC11420hj == null || !interfaceC11420hj.AId()) {
                    clearFocus();
                    A0J(true);
                    return;
                }
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public void A09() {
        SearchAutoComplete searchAutoComplete = this.A0k;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC07650Zd interfaceC07650Zd = this.A0B;
        if (interfaceC07650Zd == null || !interfaceC07650Zd.ANY(text.toString())) {
            if (this.A02 != null) {
                getContext().startActivity(A06("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void A0A() {
        int[] iArr;
        if (this.A0k.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.A0a.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A0b.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void A0B() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A0k.getText());
        if (!z2 && (!this.A0M || this.A0K)) {
            z = false;
        }
        ImageView imageView = this.A0e;
        imageView.setVisibility(z ? 0 : 8);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void A0C() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A0k;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.A0M && (drawable = this.A0W) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void A0D() {
        this.A0b.setVisibility(((this.A0O || this.A0P) && !A0K() && (this.A0g.getVisibility() == 0 || this.A0i.getVisibility() == 0)) ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x005e, code lost:
        if (r8 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0E(int r10) {
        /*
            r9 = this;
            r4 = 0
            r3 = 0
            java.lang.String r5 = "SearchView"
            X.1TS r0 = r9.A0E
            android.database.Cursor r6 = r0.A02
            if (r6 == 0) goto Lb8
            boolean r0 = r6.moveToPosition(r10)
            if (r0 == 0) goto Lb8
            java.lang.String r0 = "suggest_intent_action"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r7 = X.C1MB.A00(r6, r0)     // Catch: java.lang.RuntimeException -> L88
            if (r7 != 0) goto L26
            android.app.SearchableInfo r0 = r9.A02     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r7 = r0.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L88
            if (r7 != 0) goto L26
            java.lang.String r7 = "android.intent.action.SEARCH"
        L26:
            java.lang.String r0 = "suggest_intent_data"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r8 = X.C1MB.A00(r6, r0)     // Catch: java.lang.RuntimeException -> L88
            if (r8 != 0) goto L3a
            android.app.SearchableInfo r0 = r9.A02     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r8 = r0.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L88
            if (r8 == 0) goto L60
        L3a:
            java.lang.String r0 = "suggest_intent_data_id"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r2 = X.C1MB.A00(r6, r0)     // Catch: java.lang.RuntimeException -> L88
            if (r2 == 0) goto L7b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L88
            r1.<init>()     // Catch: java.lang.RuntimeException -> L88
            r1.append(r8)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r0 = android.net.Uri.encode(r2)     // Catch: java.lang.RuntimeException -> L88
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r8 = r1.toString()     // Catch: java.lang.RuntimeException -> L88
            if (r8 != 0) goto L7b
        L60:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r1 = X.C1MB.A00(r6, r0)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r0 = "suggest_intent_extra_data"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L88
            java.lang.String r0 = X.C1MB.A00(r6, r0)     // Catch: java.lang.RuntimeException -> L88
            android.content.Intent r3 = r9.A06(r7, r3, r0, r1)     // Catch: java.lang.RuntimeException -> L88
            if (r3 == 0) goto Lb8
            goto L80
        L7b:
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch: java.lang.RuntimeException -> L88
            goto L60
        L80:
            android.content.Context r0 = r9.getContext()     // Catch: java.lang.RuntimeException -> La6
            r0.startActivity(r3)     // Catch: java.lang.RuntimeException -> La6
            goto Lb8
        L88:
            r3 = move-exception
            int r2 = r6.getPosition()     // Catch: java.lang.RuntimeException -> L8e
            goto L8f
        L8e:
            r2 = -1
        L8f:
            java.lang.String r0 = "Search suggestions cursor at row "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " returned exception."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r5, r0, r3)
            goto Lb8
        La6:
            r2 = move-exception
            java.lang.String r1 = "Failed launch activity: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r5, r0, r2)
        Lb8:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r9.A0k
            r0.setImeVisibility(r4)
            r0.dismissDropDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.A0E(int):void");
    }

    public void A0F(int i) {
        Editable text = this.A0k.getText();
        Cursor cursor = this.A0E.A02;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                CharSequence A6Z = this.A0E.A6Z(cursor);
                if (A6Z != null) {
                    setQuery(A6Z);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public void A0G(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void A0H(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.A0H = charSequence;
        }
    }

    public final void A0I(boolean z) {
        boolean z2 = this.A0O;
        this.A0g.setVisibility((!z2 || !(z2 || this.A0P) || A0K() || !hasFocus() || (!z && this.A0P)) ? 8 : 0);
    }

    public final void A0J(boolean z) {
        this.A0L = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.A0k.getText());
        this.A0h.setVisibility(i2);
        A0I(z2);
        this.A0Z.setVisibility(z ? 8 : 0);
        ImageView imageView = this.A0f;
        imageView.setVisibility((imageView.getDrawable() == null || this.A0M) ? 8 : 8);
        A0B();
        boolean z3 = !z2;
        int i3 = 8;
        if (this.A0P && !A0K() && z3) {
            this.A0g.setVisibility(8);
            i3 = 0;
        }
        this.A0i.setVisibility(i3);
        A0D();
    }

    public boolean A0K() {
        return this.A0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.A0J = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.A0J = false;
    }

    public int getImeOptions() {
        return this.A0k.getImeOptions();
    }

    public int getInputType() {
        return this.A0k.getInputType();
    }

    public int getMaxWidth() {
        return this.A01;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    public CharSequence getQuery() {
        return this.A0k.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.A0G;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.A02;
            return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.A0l : getContext().getText(this.A02.getHintId());
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.A0S;
    }

    public int getSuggestionRowLayout() {
        return this.A0T;
    }

    public C1TS getSuggestionsAdapter() {
        return this.A0E;
    }

    @Override // X.InterfaceC07620Za
    public void onActionViewCollapsed() {
        A0H("");
        clearFocus();
        A0J(true);
        this.A0k.setImeOptions(this.A00);
        this.A0K = false;
    }

    @Override // X.InterfaceC07620Za
    public void onActionViewExpanded() {
        if (this.A0K) {
            return;
        }
        this.A0K = true;
        SearchAutoComplete searchAutoComplete = this.A0k;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.A00 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.A0m);
        post(this.A0I);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.A0k;
            Rect rect = this.A03;
            searchAutoComplete.getLocationInWindow(this.A0Q);
            getLocationInWindow(this.A0R);
            int[] iArr = this.A0Q;
            int i5 = iArr[1];
            int[] iArr2 = this.A0R;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.A04;
            Rect rect3 = this.A03;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C11460hn c11460hn = this.A0D;
            Rect rect4 = this.A04;
            Rect rect5 = this.A03;
            if (c11460hn == null) {
                C11460hn c11460hn2 = new C11460hn(rect4, rect5, searchAutoComplete);
                this.A0D = c11460hn2;
                setTouchDelegate(c11460hn2);
                return;
            }
            c11460hn.A04.set(rect4);
            Rect rect6 = c11460hn.A03;
            rect6.set(rect4);
            int i8 = -c11460hn.A01;
            rect6.inset(i8, i8);
            c11460hn.A02.set(rect5);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (A0K()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.A01;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.A01;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.A01) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1SM)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1SM c1sm = (C1SM) parcelable;
        super.onRestoreInstanceState(((AbstractC13390lB) c1sm).A00);
        A0J(c1sm.A00);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1SM c1sm = new C1SM(super.onSaveInstanceState());
        c1sm.A00 = A0K();
        return c1sm;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.A0m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.A0J && isFocusable()) {
            if (!A0K()) {
                boolean requestFocus = this.A0k.requestFocus(i, rect);
                if (requestFocus) {
                    A0J(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i, rect);
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.A05 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            A08();
            return;
        }
        A0J(false);
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A07;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.A0M == z) {
            return;
        }
        this.A0M = z;
        A0J(z);
        A0C();
    }

    public void setImeOptions(int i) {
        this.A0k.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.A0k.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC11420hj interfaceC11420hj) {
        this.A0A = interfaceC11420hj;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A08 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC07650Zd interfaceC07650Zd) {
        this.A0B = interfaceC07650Zd;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A07 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC11430hk interfaceC11430hk) {
        this.A0C = interfaceC11430hk;
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void setQueryHint(CharSequence charSequence) {
        this.A0G = charSequence;
        A0C();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.A0N = z;
        C1TS c1ts = this.A0E;
        if (c1ts instanceof C1MB) {
            ((C1MB) c1ts).A03 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0089, code lost:
        if (getContext().getPackageManager().resolveActivity(r1, 65536) != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.A02 = r8
            r3 = 1
            r4 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r8 == 0) goto L67
            androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r7.A0k
            int r0 = r8.getSuggestThreshold()
            r6.setThreshold(r0)
            android.app.SearchableInfo r0 = r7.A02
            int r0 = r0.getImeOptions()
            r6.setImeOptions(r0)
            android.app.SearchableInfo r0 = r7.A02
            int r1 = r0.getInputType()
            r0 = r1 & 15
            if (r0 != r3) goto L34
            r0 = -65537(0xfffffffffffeffff, float:NaN)
            r1 = r1 & r0
            android.app.SearchableInfo r0 = r7.A02
            java.lang.String r0 = r0.getSuggestAuthority()
            if (r0 == 0) goto L34
            r1 = r1 | r4
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
        L34:
            r6.setInputType(r1)
            X.1TS r0 = r7.A0E
            if (r0 == 0) goto L3e
            r0.A62(r2)
        L3e:
            android.app.SearchableInfo r0 = r7.A02
            java.lang.String r0 = r0.getSuggestAuthority()
            if (r0 == 0) goto L64
            android.content.Context r5 = r7.getContext()
            android.app.SearchableInfo r2 = r7.A02
            java.util.WeakHashMap r1 = r7.A0n
            X.1MB r0 = new X.1MB
            r0.<init>(r5, r7, r2, r1)
            r7.A0E = r0
            r6.setAdapter(r0)
            X.1TS r2 = r7.A0E
            X.1MB r2 = (X.C1MB) r2
            boolean r1 = r7.A0N
            r0 = 1
            if (r1 == 0) goto L62
            r0 = 2
        L62:
            r2.A03 = r0
        L64:
            r7.A0C()
        L67:
            android.app.SearchableInfo r0 = r7.A02
            if (r0 == 0) goto La9
            boolean r0 = r0.getVoiceSearchEnabled()
            if (r0 == 0) goto La9
            android.app.SearchableInfo r0 = r7.A02
            boolean r0 = r0.getVoiceSearchLaunchWebSearch()
            if (r0 == 0) goto L9e
            android.content.Intent r1 = r7.A0V
        L7b:
            if (r1 == 0) goto La9
            android.content.Context r0 = r7.getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r1, r4)
            if (r0 == 0) goto La9
        L8b:
            r7.A0P = r3
            if (r3 == 0) goto L96
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r7.A0k
            java.lang.String r0 = "nm"
            r1.setPrivateImeOptions(r0)
        L96:
            boolean r0 = r7.A0K()
            r7.A0J(r0)
            return
        L9e:
            android.app.SearchableInfo r0 = r7.A02
            boolean r0 = r0.getVoiceSearchLaunchRecognizer()
            if (r0 == 0) goto La9
            android.content.Intent r1 = r7.A0U
            goto L7b
        La9:
            r3 = 0
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.A0O = z;
        A0J(A0K());
    }

    public void setSuggestionsAdapter(C1TS c1ts) {
        this.A0E = c1ts;
        this.A0k.setAdapter(c1ts);
    }

    /* loaded from: classes.dex */
    public class SearchAutoComplete extends C1S9 {
        public int A00;
        public SearchView A01;
        public boolean A02;
        public final Runnable A03;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.A03 = new Runnable() { // from class: X.0hm
                {
                    SearchView.SearchAutoComplete.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    SearchView.SearchAutoComplete searchAutoComplete = SearchView.SearchAutoComplete.this;
                    if (searchAutoComplete.A02) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.A02 = false;
                    }
                }
            };
            this.A00 = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.A00 <= 0 || super.enoughToFilter();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        @Override // X.C1S9, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A02) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.A01;
            searchView.A0J(searchView.A0K());
            searchView.post(searchView.A0m);
            if (searchView.A0k.hasFocus()) {
                searchView.A07();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A01.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.A01.hasFocus() && getVisibility() == 0) {
                this.A02 = true;
                if (getContext().getResources().getConfiguration().orientation != 2 || (method = SearchView.A0o.A02) == null) {
                    return;
                }
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.A02 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.A01 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.A00 = i;
        }
    }
}
