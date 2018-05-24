package Trait.TraitLinealization

trait FinalStep1 extends Step1 with Step2{
  override def name: String = "FinalStep1 >>" + super.name

}
