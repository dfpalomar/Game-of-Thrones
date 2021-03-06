package es.npatarino.android.gotchallenge.characters.list.presenter;

import es.npatarino.android.gotchallenge.base.list.presenter.DefaultListPresenter;
import es.npatarino.android.gotchallenge.base.list.usecases.GetListUseCase;
import es.npatarino.android.gotchallenge.characters.domain.model.GoTCharacter;

public class CharacterListPresenter
    extends DefaultListPresenter<GoTCharacter> {
  public CharacterListPresenter(GetListUseCase<GoTCharacter> listUseCase) {
    super(listUseCase);
  }
}
