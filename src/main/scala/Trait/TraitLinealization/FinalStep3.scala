package Trait.TraitLinealization

trait FinalStep3 extends Step3 with Step2 with Step1  {
  override def name: String ="FinalStep4" +  super.name
}
