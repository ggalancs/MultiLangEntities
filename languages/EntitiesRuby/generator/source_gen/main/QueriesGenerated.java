package main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import Entities.behavior.Relationship__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

@Generated
public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_8595506700186235258(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186235267(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186259417(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, "Entities.structure.Entity")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186278553(final PropertyMacroContext _context) {
    return (String) Relationship__BehaviorDescriptor.retrieveGeneratedName_id7t9nWQ964iI.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186279928(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb59938883a0aL, 0x68cb59938883a0dL, "target")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186519932(final PropertyMacroContext _context) {
    return "Entities";
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186438741(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186444500(final PropertyMacroContext _context) {
    return (String) Relationship__BehaviorDescriptor.retrieveGeneratedName_id7t9nWQ964iI.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186499356(final PropertyMacroContext _context) {
    return (String) Relationship__BehaviorDescriptor.retrieveGeneratedName_id7t9nWQ964iI.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186504257(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), MetaAdapterFactory.getConcept(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, "Entities.structure.Entity")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8595506700186586559(final PropertyMacroContext _context) {
    return (String) Relationship__BehaviorDescriptor.retrieveGeneratedName_id7t9nWQ964iI.invoke(_context.getNode());
  }
  public static Iterable<SNode> sourceNodesQuery_8595506700186209834(final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.roots(_context.getInputModel(), MetaAdapterFactory.getConcept(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, "Entities.structure.Entity"));
  }
  public static Iterable<SNode> sourceNodesQuery_8595506700186236191(final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.roots(_context.getInputModel(), MetaAdapterFactory.getConcept(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, "Entities.structure.Entity"));
  }
  public static Iterable<SNode> sourceNodesQuery_8595506700186263038(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, 0x68cb59938883a49L, "relationships"));
  }
  public static Iterable<SNode> sourceNodesQuery_8595506700186297959(final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.roots(_context.getInputModel(), MetaAdapterFactory.getConcept(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, "Entities.structure.Entity"));
  }
  public static Iterable<SNode> sourceNodesQuery_8595506700186443771(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, 0x68cb59938883a49L, "relationships"));
  }
  public static Iterable<SNode> sourceNodesQuery_8595506700186498350(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, 0x68cb59938883a49L, "relationships"));
  }
  public static Iterable<SNode> sourceNodesQuery_8595506700186586567(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x81baee788ceb49aaL, 0x8e77ea7539ef3920L, 0x68cb599388839d2L, 0x68cb59938883a49L, "relationships"));
  }
}