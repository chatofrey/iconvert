package com.kimboofactory.iconvert.ui.search.dagger;

import com.kimboofactory.iconvert.ui.search.presentation.MvpSearchView;
import com.kimboofactory.iconvert.ui.search.views.SearchCurrencyActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CK_ALEENGO on 02/03/2019.
 * Copyright (c) 2019. All rights reserved.
 */
@Module(subcomponents = SearchViewComponent.class)
public class SearchModule {

    private final SearchCurrencyActivity activity;

    public SearchModule(SearchCurrencyActivity activity) {
        this.activity = activity;
    }

    @SearchScope
    @Provides
    public SearchCurrencyActivity searchCurrencyActivity() {
        return activity;
    }

    @Provides
    @SearchScope
    public MvpSearchView view(SearchCurrencyActivity activity) {
        return new MvpSearchView(activity);
    }

    /*@Provides
    @SearchScope
    public SearchPresenter presenter() {

    }*/

   /* @Provides
    @SearchScope
    public Integer requestCode(SearchCurrencyActivity activity) {
        return activity.getIntent()
                .getIntExtra(Constant.REQUEST_CODE, MvpSearchView.NO_EXTRA);
    }

    @Provides
    @SearchScope
    public SearchCurrencyAdapter adapter(SearchCurrencyActivity activity, Integer requestCode) {
        return new SearchCurrencyAdapter(activity, Constant.CURRENCY_IHMS_EMPTY_LIST, requestCode);
    }

    @Provides
    @SearchScope
    public SearchPresenter presenter(CurrencyRepository repository) {
        return new SearchPresenter(repository);
    }*/
}
